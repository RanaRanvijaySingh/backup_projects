package com.webonise.vaar.view;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;

import com.webonise.vaar.annotationinterface.SearchColumn;
import com.webonise.vaar.utility.AnnotationResolver;

/**
 * @author Anvay Rajhansa This class is to manage the custom tag MySearch
 * 
 */


public class VaarSearchTag extends BodyTagSupport {

	private static final long serialVersionUID = 1L;
	private String definition;
	
	
	public VaarSearchTag(){
		
	}

	private AnnotationResolver annotationResolver = new AnnotationResolver();

	/**
	 * @return the definition
	 */
	public String getDefinition() {

		return definition;
	}

	/**
	 * @param definition
	 *            the definition to set definition given in attribute
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.jsp.tagext.BodyTagSupport#doStartTag()
	 */
	public int doStartTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		
		Field[] fields=annotationResolver.getFields(definition);
		
		try {
	
			out.print("</head>");
			out.print("<body>");
			out.print("<div style=\"border: 2px solid black;float:left;\">");
				out.print("<input id=\"def\" type=\"hidden\" name=\"definition\" value="+definition+">");
				
					out.print("<div id=\"searchdiv\" style=\"float: left; margin: 50px 50px;\">");
						out.print("<table border=\"2px solid black\">");
						for (int i = 0; i < fields.length; i++) {
							Field field=fields[i];
							Annotation an[] = field.getAnnotations();
							for (int j = 0; j < an.length; j++) {
								if (an[j]
										.toString()
										.startsWith("@com.webonise.vaar.annotationinterface.SearchColumn")){
									SearchColumn column=field.getAnnotation(SearchColumn.class);
									out.print("<tr>");
									out.print("<td><label>"+column.label()+"</label></td>"); 
									out.print("<td><input datatype="+column.type()+" type=\"text\" name="+field.getName()+"></td>");
								out.print("</tr>");
								}
							}
						}
						out.print("<tr><td colspan=\"2\" align=\"center\"> <button onclick=\"return search()\">Search</button></td></tr></table></div>");
		out.print("<div id=\"table\" style=\"float: left;margin:50px 50px;\">	</div></div>");
			out.print("</body>");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		return SKIP_BODY;
	}

	
	public int doEndTag() throws JspException {
		return SKIP_PAGE;
	}


}


<%@ taglib prefix="ex" uri="WEB-INF/custom.tld"%>

<html>
<head>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
</script>
<script>
function validate()
{
	var ele=document.getElementById('searchdiv').getElementsByTagName('input');
	var len=ele.length;
	var count=0;
	if(len==0)
	return false;
	for(var j=0;j<len;j++)
	{
		if((ele[j].value=="")==true)
			count=count+1;		
	}
	if(count>=len)
	{
		alert("Atlease one field Required");
		return false;
	}
   for(var i=0;i<len;i++)
	{
		 var type=ele[i].getAttribute('datatype');
		 if(type=="String" || type=="Long" || type=="Date")
			 {
			   if(type=="String" && ele[i].value!="")
				   {
				     var val=ele[i].value;
				     if(val.startsWith("'") && val.endsWith("'") && val.length>2)
				    	 {}
				     else
				    	 {
				    	   alert('Invalid String');
				    	   ele[i].focus();
				    	   ele[i].value="";
				    	   return false;
				    	 }
				   }
			   if(type=="Long" && ele[i].value!="")
				   {
				     var letters = /^[0-9]+$/;
				     if(!ele[i].value.match(letters))
					   {
					     alert('only numbers allowed');
					     ele[i].focus();
					     ele[i].value="";
					     return false;
					   }
				   }
			   if(type=="Date" && ele[i].value!="")
				   {
				      var matches = /^(\d{2})[-\/](\d{2})[-\/](\d{4})$/.exec(ele[i].value);
				      
				      
				      if (matches != null)
				    	  {
				    	     var d = matches[2];
					         var m = matches[1] - 1;
					         var y = matches[3];
					         var composedDate = new Date(y, m, d);
				    	     
					         if((composedDate.getDate() == d &&
					            composedDate.getMonth() == m &&
					            composedDate.getFullYear() == y))
				   		      {
				   		        return true;   
				   		      }
				    	  }
					        	    alert("Invalid Date Format(use (MM-DD-YYYY) format)");
					   		        ele[i].focus();
							        ele[i].value="";
					   		        return false;
				   }
			 }
		 else
			 {
			    alert("Annotation Specified with invalid Datatype(use String or Long or Date)");
			    return false;
			 }
			 
	}
	return true;
}

function search()
{
	if(!validate())
	return true;
	document.getElementById("table").innerHTML="";
	var param="";
	var ele=document.getElementById('searchdiv').getElementsByTagName('input');
	param+='definition';
	param+=",";
	param+=document.getElementById('def').value;
	for ( var i = 0; i < ele.length; i++) {
		param+=",";
		param+=ele[i].getAttribute('name');
		param+=",";
		if(ele[i].value!="")
			param+=ele[i].value;
		else
			param+="?";
	}
	//var myList=
		$.ajax({
		type: "GET",
		url: "fetcher.html",
		async: false,
		data:{parameters:param},
		//dataType:"json",
		success:function(myList) {
			var json = JSON.parse(myList);
			buildTable(json);
		    },
		    failure:function (error) {
                alert('error; ' + eval(error));
            }
		}); 		
		
}

function makeColumns(myList)
{
	 var columns=new Array();
	 for(var i=0;i<myList.length;i++)
		 {
		   for(var key  in myList[i])
		   {
			     if(notExist(columns,key))
                  columns.push(key); 
		   } 
		 }
  return columns;	
}

function notExist(columns,key)
{
	 for ( var i = 0; i < columns.length; i++) {
		if(columns[i]==key)
			return false;
	}
	 return true;
}

function buildTable(myList)
{
	 var columns=makeColumns(myList);
	 var table="<table border=\"2px\">";
	 table+="<tr>";
	 for(var i=0;i<columns.length;i++)
		table+="<td>"+columns[i]+"</td>";
		table+="</tr>";
	 for(var i=0;i<myList.length;i++)
	 {
		 table+="<tr>";
	   for(var key  in myList[i])
	   {
		   table+="<td>"+myList[i][key]+"</td>";
	    }
	   table+="</tr>";
	 }
	 table+="</table>"
		document.getElementById("table").innerHTML=table;
}
</script>

<ex:MySearch definition="com.webonise.vaar.user.Employee" />

</html>




package com.webonise.assignment.fileoperation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * @author Ranvijay 
 * this class shows the file operations that is 
 * performed on the two files "file1.txt" and "file2.txt"
 * 
 */
public class FileOperation 
{
	public static void main (String args[]) throws IOException
	{
		FileInputStream fileread=new FileInputStream("file1.txt");
		BufferedReader reader=new BufferedReader(new InputStreamReader(fileread));
		
		PrintStream out = null;

		out = new PrintStream(new FileOutputStream("file2.txt"));
	
		
		String line =reader.readLine();

		while(line!=null)
		{
			System.out.println(line);
			out.println(line);
			line =reader.readLine();
		}
		
	}

}

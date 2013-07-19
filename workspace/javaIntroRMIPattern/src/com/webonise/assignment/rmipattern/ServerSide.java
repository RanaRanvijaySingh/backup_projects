package com.webonise.assignment.rmipattern;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerSide  
{
	ServerSide() throws IOException 
	{
		try {
			
			RemoteInterface pattern = new PatternCheck();
			Naming.rebind("rmi://localhost:1099/PatternService", pattern);
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main (String args[]) throws IOException 
	{
		new ServerSide();
	}

}
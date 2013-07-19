package demo.rmi.print.client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import demo.rmi.print.common.RemotePrinter;

public class PrintClient {

	public static void main(String[] args) {
		
		try{
			System.setSecurityManager(new RMISecurityManager());
			RemotePrinter printer= (RemotePrinter) Naming.lookup("rmi://localhost/print");
		
			int jobID = printer.submitJob("hello world");
			System.out.println("submitted job "+ jobID);
			System.out.println("is job completed ? "+ printer.isCompplete(jobID));
			System.out.println("printer status ? "+ printer.getPinterStatus());
			
			
		}catch(Exception e)
		{
			
		}

	}

}

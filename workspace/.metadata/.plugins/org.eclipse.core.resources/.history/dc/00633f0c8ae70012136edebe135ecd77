package com.webonise.assignment.rmipattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PatternCheck extends UnicastRemoteObject implements RemoteInterface
{
	String line =null;
	protected PatternCheck() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String displayString(String line) {
		// TODO Auto-generated method stub
		this.line=line;
		System.out.println("the sentance is :"+line);
		return null;
	}
	

}

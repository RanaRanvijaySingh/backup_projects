package demo.rmi.print.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemotePrinter extends Remote {

	
	public int submitJob(String text) throws RemoteException;
	
	public boolean isCompplete(int jobID) throws RemoteException;
	
	public String getPinterStatus() throws RemoteException;
	
}

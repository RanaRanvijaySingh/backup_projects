package com.webonise.assignment.rmipattern;

import java.rmi.Remote;

public interface RemoteInterface extends Remote
{
	public void displayString(String line);
	
}

package com.webonise.assignment.rmipattern1;
import java.rmi.*;

public interface HelloInterface extends Remote{

public String getMessage() throws RemoteException;

}

package com.webonise.assignment.rmipattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteServer extends Remote {

    public String sayHello() throws RemoteException;
}
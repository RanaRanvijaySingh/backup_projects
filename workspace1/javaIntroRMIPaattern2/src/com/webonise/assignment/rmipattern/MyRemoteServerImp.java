package com.webonise.assignment.rmipattern;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServerImp extends UnicastRemoteObject implements MyRemoteServer {

    public static void main(String[] args) {
        try {
            MyRemoteServer service = new MyRemoteServerImp();
            Naming.rebind("MyFirstRemoteService", service);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public MyRemoteServerImp() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "Hi I'm server!";
    }
}
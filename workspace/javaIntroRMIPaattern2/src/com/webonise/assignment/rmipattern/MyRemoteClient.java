package com.webonise.assignment.rmipattern;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyRemoteClient  {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemoteServer service = (MyRemoteServer) Naming.lookup("rmi://127.0.0.1/MyFirstRemoteService");
            String s = service.sayHello();

            System.out.println(s);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
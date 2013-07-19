package com.webonise.assignment.rmipattern1;
import java.rmi.*;

import java.rmi.server.*;

import java.net.MalformedURLException;

public class HelloServerImpl extends UnicastRemoteObject implements HelloInterface

{

public HelloServerImpl()throws RemoteException

{

System.out.println("Creating server object");

}

public String getMessage() throws RemoteException

{

return "HelloWorld";

}

public static void main(String[] helloworld)

{

try{

HelloServerImpl hsi=new HelloServerImpl();

Naming.rebind("rmi://localhost/ref",hsi);

System.out.println("ServerReady");

}

catch(RemoteException ex)

{

System.out.println("Error"+ex.getMessage());

}

catch(MalformedURLException ex){

System.out.println("Error"+ex.getMessage());

}

}

}

package com.webonise.assignment.rmipattern1;
import java.rmi.*;

import java.net.MalformedURLException;

public class HelloClient

{

public static void main(String[]helloClient)

{

try

{

HelloInterface server=(HelloInterface)Naming.lookup("rmi://localhost/ref");

String msg=server.getMessage();

System.out.println(msg);

}

catch(RemoteException ex)

{

System.out.println("Error"+ex.getMessage());

}catch(MalformedURLException ex)

{

System.out.println("Error"+ex.getMessage());

}

catch(NotBoundException ex)

{

System.out.println("Error"+ex.getMessage());

}

}

}

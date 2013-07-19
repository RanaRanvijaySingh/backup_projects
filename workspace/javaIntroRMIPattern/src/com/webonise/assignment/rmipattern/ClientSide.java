package com.webonise.assignment.rmipattern;

import java.rmi.Naming;

public class ClientSide 
{
    public static void main(String[] args) 
    {
        try
        {
            RemoteInterface c = (RemoteInterface) Naming.lookup("//127.0.0.1:1099/CalculatorService");
            c.displayString("((()))");
            
        } 
        catch (Exception e) 
        {
            System.out.println("this is the exception in the client side");
        }
    }
}
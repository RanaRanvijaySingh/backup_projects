package com.webonise.assignment.rmipattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Stack;

public class PatternCheck extends UnicastRemoteObject implements RemoteInterface
{
	String s =null;
	protected PatternCheck() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void displayString(String line) {
		// TODO Auto-generated method stub
		this.s=line;
		if(this.checkPattern())
			System.out.println("pattern is correct");
		else
			System.out.println("pattern is incorrect");
		
	}
	public boolean checkPattern()
	{

        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) 
        {

            if(s.charAt(i) == '[')   
            	stack.push('[');
            
            else if (s.charAt(i) == '{')   
            	stack.push('{');

            else if (s.charAt(i) == '(') 
            	stack.push('(');

            else if (s.charAt(i) == ')') 
            {
                if (stack.isEmpty())        
                	return false;
            
                if (stack.pop() != '(') 
                	return false;
                
            }

            else if (s.charAt(i) == '}') 
            {
                if (stack.isEmpty())        
                	return false;
                
                if (stack.pop() != '{') 
                	return false;
            }

            else if (s.charAt(i) == ']') 
            {
                if (stack.isEmpty())        
                	return false;
                
                if (stack.pop() != '[') 
                	return false;
            }

        }
        return stack.isEmpty();
	}
	

}

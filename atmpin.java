package myproject;

import java.util.Scanner;

public class atmpin {
	public static void main(String[]args)
	{
    Scanner sc= new Scanner(System.in);
    int i=1,flag=0;
    String password;
   // for(i=1;i<=3;i++)
    while(i<=3)
    {
    	System.out.println("enter password");
    	password =sc.next();
    	if(password.equals("1234"))
    	{
    		System.out.println("access allowed");
    		break;
    		
    	}
    	i++;
    }
    if(i==4)
    {
    	System.out.println("card blocked");
    }
    	
    
	}

}

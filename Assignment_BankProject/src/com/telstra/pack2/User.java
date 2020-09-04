package com.telstra.pack2;

import java.util.Scanner;

public class User {

		private int bankAccNo;
		private String userName;
		int balance=1000;
		private int withdraw,deposit;
		
		Scanner sc=new Scanner(System.in);
		 
		public void depositac(int amt)
		{
			 System.out.print("Enter money to be deposited:");
             deposit = sc.nextInt();
             balance = balance + deposit;
             System.out.println("Your Updated Balance is "+balance);

		}
		
		public void withdrawac(int amt)
		{
			System.out.print("Enter money to be withdraw:");
            withdraw = sc.nextInt();
            if(withdraw<balance)
            {
            	balance=balance-withdraw;
            	System.out.println("Your Updated Balance is "+balance);
            }
		}
		
}

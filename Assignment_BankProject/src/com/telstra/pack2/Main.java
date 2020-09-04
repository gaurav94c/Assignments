package com.telstra.pack2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
           
            User u1=new User();
            switch(n)
            {
            case 1: u1.withdrawac(300);
            		break;
            
            case 2: u1.depositac(500);
            		break;
            }

	}

}

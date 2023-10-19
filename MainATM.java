package com.OIBSIP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainATM {
	public static void main(String[] args) {
		try {
	    int choice=0;
		
		Scanner sc = new Scanner(System.in);
		ATM_operations atm = new ATM_operations();
		do {
		System.out.print("Enter your id : ");
		String id = sc.next();
		atm.setuserID(id);
		
		System.out.print("Enter your pin : ");
		int pin = sc.nextInt();
		atm.setuserPin(pin);
		
		System.out.print("Enter the bal : ");
		float balance= sc.nextFloat();
		atm.setBalance(balance);
		
		if((id!=null) && (pin!=0)) {
			do {
			System.out.println("\n1. Transaction History \n2. Withdraw \n3. Deposit \n4. Transfer \n5. Quit ");
			System.out.print("\nEnter your Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1  : atm.trans_Hist();
			          continue;
			case 2  :atm.withdraw();
			          continue;
			case 3  : atm.deposit();
			          continue;
			case 4  : atm.transfer();
			          continue;
			case 5 : System.exit(0);
			         break;
			}
			choice++;
		}while(choice<=5);
   	}sc.close();
	}	while(true);
		
	}catch(InputMismatchException e) {
		System.out.println(" \n\n============Please enter USER_ID without space and PIN as number=============");
	}
  }
}

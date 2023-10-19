package com.OIBSIP;
import java.util.Scanner;

public class ATM_operations implements ATM{
	
	private String user_id;
	private int user_pin;
	float amount,bal,new_amount,amount1;
	Scanner sc = new Scanner(System.in);
	public void setuserID(String User_id) {
		user_id =  User_id;
	}
	
	public String getuserID() {
		return user_id;
	}
	
	public void setuserPin(int pin) {
		user_pin = pin;
	}
	
	public int getuserPin() {
		return user_pin;
	}
	
	public void setAmount(float amt) {
		amount =  amt;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setBalance(float balance) {
		bal = balance;
	}
	
	public float getBalance() {
		return bal;
	}
	
	@Override
	public void deposit() {
		System.out.print("Enter the amount : ");
        float amount= sc.nextFloat();
		bal = bal + amount;       
		System.out.println("\n Balance after deposit "+ bal +" and amount deposited is "+amount+"\n");
		
	}

	@Override
	public void withdraw() {
		System.out.print("Enter the amount : ");
        float amount= sc.nextFloat();
		if(bal<amount) {
			System.out.println("\nInsufficient Balance...\n");
		}else {
			bal = bal - amount;
			System.out.println("\nAmount deducted is "+amount+" balance left "+bal+"\n");
		}
		
	}
	@Override
	public void transfer() {
		System.out.print("Enter the amount to be transferred : ");
		new_amount=sc.nextFloat();
		if(new_amount!=0) {
			bal = bal - new_amount;
			System.out.println("\nAmount "+new_amount+" transferred successfully total balance is "+bal+"\n");
		}else {
			amount1=sc.nextFloat();
			bal = bal + new_amount;
			System.out.println("\nAmount received "+ amount1 + "total balance "+bal+"\n");
		}
	}

	@Override
	public void trans_Hist() {
		System.out.println(" ");
		System.out.println("Current Account User : "+user_id);
		System.out.println("Current Balance : "+bal);
		System.out.println("Amount "+new_amount+" transferred");
		System.out.println("Amount received "+ amount1 + "\ncurrent balance "+bal);
		System.out.println(" ");
	}
	
}

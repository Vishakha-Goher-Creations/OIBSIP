package com.OIBSIP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args) {
	  
		try {
		Scanner sc = new Scanner(System.in);
		
		int userGuess=0,attempt;
		int myNum = (int)(Math.random()*100);
	   
	    for(attempt=1;attempt<=5;attempt++) {
	    	if(userGuess!= myNum) {
	    	System.out.println("You have " + (6-attempt) + " chances left");
	        System.out.print("Hey! There Guess A Number (1-100) : ");
	        
	    	
	    	do {
				userGuess = sc.nextInt();
				if((userGuess == myNum) ) {
					System.out.println("\n\t\t===== ( Pure Genius ) =====\t\t\n");
					System.out.println("Your score is 100");
					break;
				}
				else if(userGuess > myNum) {
					System.out.println("\n\t\t===== ( Number is too large ) =====\t\t\n");
					System.out.println("Your score is 0");
					break;
					
				}
				else { 
					System.out.println("\n\t\t===== ( The number is too small ) =====\t\t\n");
					System.out.println("Your score is 0");
					break;
				}
				
			}while(userGuess <= myNum && userGuess <= attempt);
	     }
	    } System.out.println("My Number was : "+myNum);
	    System.out.println("\nYour all chances are over ");
		}catch(InputMismatchException e) {    
			System.out.println("Please give a valid input as number...");
		}
	}
}

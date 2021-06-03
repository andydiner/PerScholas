package com.perscholas.java_basics;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println("Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.");
		int inc = 0;
		while(inc <= 100) {
			System.out.println(inc);
			inc += 10;
		}

		System.out.println("Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.");
		int y = 1;
		do {
			System.out.println(y);
			y++;
		}while(y <= 10);
		
		System.out.println("Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75. Use the “continue” statement to accomplish this.");
		for(int i = 1; i <=100; i++) {
			 if(i > 25 && i < 75) {
				 continue;
			 }
			 if(i%5 == 0) {
				 System.out.println(i);
			 }
		 }

		 System.out.println("Write a program that uses a for-loop to loop through the numbers 1-100. Print out each number if is a multiple of 5, but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.");
		for(int i = 1; i<= 100; i++) {
			if(i > 50) {
				break;
			}
			if(i%5 ==0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("Write a program that uses nested for-loops to output 5 days for 2 weeks.");
		for(int i = 1; i < 3; i++) {
			System.out.println("Week " + i + ":");
			for (int j = 1; j <6; j++) {
				System.out.println("Day " + j);
			}
		}
		
		
		System.out.println("Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:\r\n"
				+ "11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,\r\n"
				+ "\r\n"
				+ " ");
		
		
		for(int i = 10; i <= 200; i++) {
			String palCheck = Integer.toString(i);
			if(palCheck.charAt(0) == palCheck.charAt(palCheck.length()-1)) {
				System.out.print(i + ", ");
				
			}
		}
		
		
		System.out.println("\n\nWrite a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,");
		
		int check1 = 0;
		int check2 = 1;
		int sumFib = 0;
			for(int j = 1; j < 11; j++) {
				
				System.out.println(check1 + " ");
				
				sumFib = check1 + check2;
				check2 = check1;
				check1 = sumFib;
				
			}
		
		System.out.println("Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j) in the inner loop (e.g., System.out.println(\"Inner loop: i: \" + i + \", j: \" + j);).");
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("Inner loop i: " + i + ", j: " + j);
			}
		}
		
		
		
	}

}

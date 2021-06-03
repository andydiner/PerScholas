package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 15;
		if(x < 10) {
			System.out.println("Less than 10");
		}

		
		
		int x2 = 15;
		if(x2 < 10) {
			System.out.println("Less than 10");
		}else {
			System.out.println("Greater than 10");
		}
		
		
		
		
		int x3 = 52;
		
		if(x3 < 10) {
			System.out.println("Less than 10");
		}else if(x3 > 10 && x3 < 20) {
			System.out.println("Between 10 and 20(not inclusive)");
			
		}else if(x3 >= 20) {
			System.out.println("Greater than or equal to 20");
		}
		
		
		
		
		
		int x4 = 5;
		if(x4 < 10 || x4 > 20) {
			System.out.println("Out of range");
		}else if(x4 >=10 && x4 <= 20) {
			System.out.println("In range");
		}
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int grade = scan.nextInt();
		String letterGrade = "";
		
		if(grade >= 90 && grade <= 100) {
			letterGrade = "A";
			System.out.println("Your letter grade is: " + letterGrade);
		}else if(grade >=80 && grade < 90) {
			letterGrade = "B";
			System.out.println("Your letter grade is: " + letterGrade);
		}else if(grade >= 70 && grade < 80) {
			letterGrade = "C";
			System.out.println("Your letter grade is: " + letterGrade);
		}else if (grade >= 60 && grade < 70) {
			letterGrade = "D";
			System.out.println("Your letter grade is: " + letterGrade);
		}else if(grade < 60 && grade > 0) {
			letterGrade = "F";
			System.out.println("Your letter grade is: " + letterGrade);
		}else {
			System.out.println("Score out of range.");
		}
		
		
	
		System.out.println("Please enter numerical weekday");
		int input = scan.nextInt();

		scan.close();
		String weekday = "";
		switch(input) {
		
		case 1: weekday = "Monday";break;
		case 2: weekday = "Tuesday"; break;
		case 3: weekday = "Wednsday"; break;
		case 4: weekday = "Thursday"; break;
		case 5: weekday = "Friday"; break;
		case 6: weekday = "Saturday"; break;
		case 7: weekday = "Sunday"; break;
		default: weekday = "out of range";		
		
		}
		System.out.println("Weekday is: " + weekday);
			
		
	}

}

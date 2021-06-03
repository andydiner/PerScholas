package com.perscholas.java_basics;

public class JavaBasicsClass {

	private static final int constantInt = 15;
	private static final double SALES_TAX = .1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int testOne = 15;
		int testTwo = 37;
		int testSum = testOne + testTwo;
		System.out.println(testSum);
		
		
		
		
		//Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
		double testA = 22.5;
		double testB = 14.3;
		double testC = testA + testB;
		System.out.println(testC);

		
	//	Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable.
		//Print out the result. What variable type must the sum be?
		 int intVar = 22;
		 double doubVar = 5.6;
		 double intDoub = intVar + doubVar;
		 System.out.println(intDoub + " The sum must be a Double." );
		

	//	Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
		 //Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
		 int intOne = 9;
		 int intTwo = 17;
		 int intThree = intTwo/intOne;
		 System.out.println(intThree + ", It errors out because an int cannot be a decimal. We need to convert to float or double.");

	//	Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
		 //Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
		 double doubOne = 3.7;
		 double doubTwo = 9.2;
		 double doubThree = doubTwo/doubOne;
		 System.out.print(doubThree);
		 int doubInt = (int)(doubThree);
		 System.out.println(", Result cast as an integer: " + doubInt);
		 

	//	Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q.
		 //Now, cast y to a double and assign to q. Print q again.
		 int x = 5;
		 int y = 6;
		 double q = y/x;
		 System.out.print(q);
		  q = (double)(y);
		 System.out.println(", y cast as double and assigned to q: " + q);

	//	Write a program that declares a named constant and uses it in a calculation. Print the result.
		 
		 int checkConst = 25;
		int mult = constantInt * checkConst;
		System.out.println("constant(25) * int checkConst(25) = " + mult);
		 

	//	Write a program where you create 3 variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
		 //Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product,
		 //4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal.
		 //Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to 2 decimal places.

		
		double pCoff = 2.75;
		double pCapp = 3.50;
		double pEsp = 4.25;
		double subtotal = 0;
		double totalSale = 0;
		
		subtotal = pCoff * 3 + pCapp * 4 + pEsp * 2;
		totalSale = subtotal + (subtotal * SALES_TAX);
		System.out.printf("Total for 3 item1 + 4 item2 + 2 item3 = %.2f", totalSale);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

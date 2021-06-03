package com.perscholas.java_basics;

public class operatorsAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		Write a program that declares an integer a variable x and assigns the value 2 to it 
		and prints out the binary string version of the number ( Integer.toBinaryString(x) ). 
		Now, use the left shift operator (<<) to shift by 1 and assign the result to x. 
		Before printing the results, write a comment with the predicted decimal value and binary string. 
		Now, print out x in decimal form and in binary notation.
		Do the preceding exercise with the following values:

		9				 1001   8 + 1
		<<1         0001 0010   16 + 2 = 18
		17			0001 0001   16 + 1
		<<1         0010 0010   32 + 2 = 34
		88			0101 1000   64 + 16 + 8
		<<1         1011 0000   128 + 32 + 16 = 176
		*/
		System.out.println("========Exercise 1=========");
		int x = 2; // 10
		System.out.println(Integer.toBinaryString(x));
		Integer.toBinaryString(x); 
		x = x << 1;
		System.out.println(x); // 100 = 4
		
		int left1 = 9;
		int left2 = 17;
		int left3 = 88;
		System.out.println(Integer.toBinaryString(left1));
		System.out.println(Integer.toBinaryString(left2));
		System.out.println(Integer.toBinaryString(left3));
		left1 = left1<<1;
		left2 = left2<<1;
		left3 = left3<<1;
		System.out.println(left1);
		System.out.println(left2);
		System.out.println(left3);
			
		
	/*
	 * Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number. 
		Now use the right shift operator (>>) to shift by 2 and assign the result to x. 
		Write a comment indicating what you anticipate the decimal and binary values to be. 
		Now print the value of x and the binary string. Do the preceding exercise with the following values:
		
		225                      1110 0001   128+64+32+1
		>>2						 0011 1000	 32+16+8 = 56
		1555				0110 0001 0011   1024 + 512 +16 + 3 = 1555
		>>2					0001 1000 0100   256+128+4 = 388
		32456		   0111 1110 1100 1000   16384 + 8192 + 4096+2048+1024+512+128+64+8
		>>2			   0001 1111 1011 0010	 4096+2048+1024+512+256+128+32+16+2 = 8114
	 */
		System.out.println("==========Exercise 2=======");
		int x2 = 150; // 1001 0110   128 + 16 + 8
		System.out.println(Integer.toBinaryString(x2));
		x2 = x2>>2; // 0010 0101 = 32 + 4 + 1 = 37
		System.out.println(x2);
	
		int check1 = 225;
		int check2 = 1555;
		int check3 = 32456;
		System.out.println(Integer.toBinaryString(check1));
		System.out.println(Integer.toBinaryString(check2));
		System.out.println(Integer.toBinaryString(check3));
		check1 = check1>>2;
		check2 = check2>>2;
		check3 = check3>>2;
		System.out.println(check1);
		System.out.println(check2);
		System.out.println(check3);

		
		/*
		 * Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y. 
Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y. 
Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y. 
As before, write a comment that indicates what you predict the values to be before printing them out.

		 */
		System.out.println("===========Exercise 3==========");
		int x1 = 7; // 0111
		int y1 = 17; // 0001 0001
		int z1 = 0;   //and: 1, 0000 0001
						//or: 0001 0111  23
		z1 = x1 & y1;
		System.out.println("and: " + z1);
		z1 = x1 | y1;
		System.out.println("or: " + z1);
		
		
		
		/*
		 * 
		 * Write a program that declares an integer variable, assigns a number, 
		and uses a postfix increment operator to increase the value.
		 Print the value before and after the increment operator.
 
		 */
		System.out.println("=========Exercise 4===========");
		int x3 = 15;
		//15
		System.out.println(x3);
		x3++;
		//16
		System.out.println(x3);
		
		
		
		/*
		 * 
		 * 
Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times. 
Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.
 

		 */
		System.out.println("=========Exercise 5==========");
		int x4 = 25;
		System.out.println(x4); //25
		x4++;
		System.out.println(x4); //26
		++x4;
		System.out.println(x4); //27
		x4 += 1;
		System.out.println(x4); //28
		
		
		
		
		/*
		 * 
		 * Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. 
Create another variable sum and assign the value of ++x added to y and print the result. 
Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. 
Notice what the value of sum is. The first configuration incremented x and then calculated the sum 
while the second configuration calculated the sum and then incremented x.
		 */
		System.out.println("=========Exercise 6==========");

		int x5 = 5;
		int y5 = 8;
		int sum = ++x5 + y5;
		
		System.out.println(sum);
		int x6 = 5;
		int y6 = 8;
		int sum2 = x6++ + y6;
		System.out.println(sum2);
		
		
		
		
	}

}

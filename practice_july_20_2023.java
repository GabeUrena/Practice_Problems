import java.util.Scanner;
import java.math.BigDecimal;
public class practice_july_20_2023 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		//https://www.w3resource.com/java-exercises/basic/index.php
		
		//1 Hello world
		System.out.println("************************* Problem 1 *************************");
		System.out.println("Hello, Gabriel Urena \n");
		
		//2 Addition
		System.out.println("\n************************* Problem 2 *************************");
		System.out.println(74+36);
		
		//3 Division
		System.out.println("\n************************* Problem 3 *************************");
		System.out.println(50/3);
	
		//4 basic operations
		System.out.println("\n************************* Problem 4 *************************");
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		//5 operation using variables
		System.out.println("\n************************* Problem 5 *************************");
		System.out.println("Type first number press enter then type the second number.");
		int first = input.nextInt();
		int second = input.nextInt();
		System.out.println(first + " x " + second + " = " + (first*second));
		
		//6 displaying all the operations with variables
		System.out.println("\n************************* Problem 6 *************************");
		System.out.println("Type first number press enter then type the second number.");
		int first2 = input.nextInt();
		int second2 = input.nextInt();
		System.out.println(first2 + " + " + second2 + " = " + (first2+second2));
		System.out.println(first2 + " - " + second2 + " = " + (first2-second2));
		System.out.println(first2 + " x " + second2 + " = " + (first2*second2));
		System.out.println(first2 + " / " + second2 + " = " + (first2/second2));
		System.out.println(first2 + " mod " + second2 + " = " + (first2%second2));
		
		//8 Printing patterns
		System.out.println("\n************************* Problem 8 *************************");
		System.out.println("   J    a   v     v  a     \r\n"
						 + "   J   a a   v   v  a a    \r\n"
			             + "J  J  aaaaa   V V  aaaaa   \r\n"
			             + " JJ  a     a   V  a     a");
		
		//9 decimals
		System.out.println("\n************************* Problem 9 *************************");
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
	
		//11 Outputing variables with double datatype
		System.out.println("\n************************* Problem 11 *************************");
		System.out.println("Enter a radius value.");
		double radius = input.nextDouble();
		System.out.println(2*Math.PI*radius);
		System.out.println(Math.PI*(radius*radius));

		
//****************************************************************************************************************************
		
		//https://www.w3resource.com/java-exercises/basic/index1.php
		
		//151 
		System.out.println("\n************************* Problem 151 *************************");
		double temp = 0;
		System.out.println("(101 + 0) / 3 -> " + (101 + 0) / 3                								+"\r\n"
						+  "(3.0e-6 * 10000000.1) -> " + 3.0e-6 * 10000000.1  								+"\r\n"
						+  "(true && true) -> " + (true && true)			  								+"\r\n"
						+  "(false && true) -> " + (false && true)			  								+"\r\n"
						+  "(false && false) || (true && true) -> " + ((false && false) || (true && true))	+"\r\n"
						+  "(false || false) && (true && true) -> " + ((false || false) && (true && true))	+"\r\n");
		
		//152
		System.out.println("\n************************* Problem 152 *************************");
		System.out.print("Input first number: ");
		int firstNum = input.nextInt();
		System.out.print("Input second number: ");
		int secondNum = input.nextInt();
		System.out.print("Input third number: ");
		int thirdNum = input.nextInt();
		System.out.print("Input fourth number: ");
		int fourthNum = input.nextInt();
		
		if(firstNum == secondNum && firstNum == thirdNum && firstNum == fourthNum) {
			System.out.println("Numbers are equal!");
		} else {
			System.out.println("Numbers are not equal!");
		}
		
		//153
		System.out.print("\nInput first number: ");
		double firstDouble = input.nextDouble();
		System.out.print("Input second number: ");
		double secondDouble = input.nextDouble();
		
		if((firstDouble <= 1 && firstDouble >= 0) && (secondDouble <= 1 && secondDouble >= 0)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		
		//THIS CODE IS WRITTEN BY GABRIEL URENA  @GabeUrena ON GITHUB
	}
}

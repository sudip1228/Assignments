package assignment1;

import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		/*Write a program to complete the task given below:
			Ask user to enter any 2 numbers in between 1-10 and add both of them to another variable  call z.
			Use z for adding 30 into it and print the final result by using variable result.*/

		Scanner in= new Scanner(System.in);
		System.out.println("enter any two number in between 1-10");
		System.out.println("enter first number");
		int firstNumber =in.nextInt();
		
		System.out.println("enter second number");
		int secondNumber =in.nextInt();
		
		int z=firstNumber + secondNumber;
		int result=z + 30;
		System.out.println(result);
		
		
	}

}

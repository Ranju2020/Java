package com.onlineJava;

import java.util.Scanner;

public class Day7 {

	static int a = 0, b = 1;

// 1. ***********************************
	static int lengthOfString(String s) {

		if(s.equals(""))
			return 0;
		else
			return 1 + lengthOfString(s.substring(1));
	}

//2.  ****************************************
	static int factorial(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorial(number - 1);
	}

// 3. ******************************************

	static void fibonacci(int term) {
		if (term == 2)
			System.out.println();
		else {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
			fibonacci(term - 1);
		}
	}

//	4. *********************************************

	static int printTable(int i, int num) {

		if (i == 10)
			return num * i;
		else {
			System.out.println(num * i);
			return printTable(i + 1, num);
		}
	}

//	*********************************************

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		System.out.println(lengthOfString(str));
		int number = sc.nextInt();
		System.out.println("Factorial : " + factorial(number));

		int i = sc.nextInt();
		System.out.println(printTable(i, number));

		int term = sc.nextInt();
		System.out.print(a + " " + b + " ");
		fibonacci(term);
	}

}

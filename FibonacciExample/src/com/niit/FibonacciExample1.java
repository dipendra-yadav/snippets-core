package com.niit;

//through Loops(without Recursion)
public class FibonacciExample1{
	public static void main(String args[]) {

		int n1 = 0;
		int n2 = 1;

		System.out.print(n1 + " " + n2);//prints 0 and 1
		int counter = 10;
		int n3;
		for (int i = 2; i < counter; i++) {

			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}
}

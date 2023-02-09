package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt();
	
		int [] allNumbers;
		allNumbers = new int[n];
		allNumbers [0] = 2;
		for (int i = 2; i < n; i++)
		{
		System.out.println(allNumbers[i] = i);
		}
	
}
}

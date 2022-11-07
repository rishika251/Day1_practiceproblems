package com.bridgelabz.day1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if (((year >= 1582) && (year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(year + " Year is a Leap Year");
		else
			System.out.println(year + " Year is not a Leap Year");

	}

}

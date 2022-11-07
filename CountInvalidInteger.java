package com.bridgelabz.day1;

public class CountInvalidInteger {
	public static void main(String[] args) {
		int n;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				n = Integer.parseInt(args[i]);
				sum = sum + n;
			} catch (NumberFormatException e) {
				count++;
			}
		}
		System.out.println("sum of command-line integer arguments:- " + sum);
		System.out.println("count the invalid integers are " + count);

	}

}

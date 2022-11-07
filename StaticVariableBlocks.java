package com.bridgelabz.day1;

public class StaticVariableBlocks {
	static int a = 12;
	static int b;

	static void func(int c) {
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
	}

	static {
		System.out.println("Static block initialized");
		b = a + 6;
	}

	public static void main(String[] args) {
		func(8);

	}

}

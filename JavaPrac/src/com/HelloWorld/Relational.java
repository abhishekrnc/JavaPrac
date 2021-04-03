package com.HelloWorld;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j = s.nextInt();
		
		boolean isEq = (i == j);
		boolean neq = (i != j);
		boolean isgr = (i > j);
		boolean isgreq = (i >=j);
		boolean isless = (i < j);
		boolean isLessEq = (i <= j);
		System.out.println("Is Equal" + isEq);
		System.out.println(neq);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}

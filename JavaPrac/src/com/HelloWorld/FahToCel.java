package com.HelloWorld;

import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double f = s.nextDouble();
		double cel = (5/9)*(f - 32);
		System.out.println(cel);

	}

}

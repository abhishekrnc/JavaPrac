package com.HelloWorld;

import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Fahrenheit Value");
		double f = s.nextDouble();
		//double cel = (5/9)*(f - 32);
		
		int cel1 = (int)((5 * (f - 32)) / 9); //Explict type casting to convert double into int
		System.out.println(f + " Fahrenheit to Celcius in Integer is " + cel1);
		
		double cel = (5 * (f - 32)) / 9;
		System.out.println(f + " Fahrenheit to Celcius in Double is " + cel);

	}

}

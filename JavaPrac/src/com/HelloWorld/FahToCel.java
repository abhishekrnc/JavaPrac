package com.HelloWorld;

import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Fahrenheit Value");
		double f = s.nextDouble();
		//double cel = (5/9)*(f - 32);
		
		double cel = (5 * (f - 32)) / 9;
		System.out.println(f + " Fahrenheit to Celcius is " + cel);

	}

}

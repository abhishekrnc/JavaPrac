package com.HelloWorld;

public class DataType {

	public static void main(String t[]) {
		
	char c = 'a';
	System.out.println(c + 3);         //Here it is taking the ASCII Value for "a". As "+" sign is only defined for the integres.
										// ASCII value for "a" is 97.
	
	int i = c + 10;
	System.out.println(i);

	i = c;
	//char abc = 1;
	
	long l = i;
	i = l;
	
	double d = i;
	//i = d;
	
	
	float f = 1.23f;  // we are writing the f in front as this will treat 1.23 as a float number
	int j = 100;
	
	f = d //we can't put double in float as double has 8 bytes and float has 4 bytes.
	
	}
		
	}



package If_else;

import java.util.Scanner;

public class LargestOfThreeFormatTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a>=b && a>=c) {
			System.out.println("A=");
			System.out.println(a);
		}
		else
			if(b>=c && b>=a) {
				System.out.println("B=");
				System.out.println(b);
			}
	}

}

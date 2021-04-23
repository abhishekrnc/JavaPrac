package patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int val = 1;
		while (i <= n) {
			int space = 1;
			while (space <= n -i) {
				System.out.print(" ");
			}
		}
	}

}

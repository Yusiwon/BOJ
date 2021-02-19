package 백준;

import java.util.Scanner;

public class p2523_별찍기13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i = 1; i < n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
		input.close();
	}

}

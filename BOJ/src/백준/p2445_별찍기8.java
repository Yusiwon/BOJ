package 백준;

import java.util.Scanner;

public class p2445_별찍기8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < (n-i)*2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i*2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
		
	}

}

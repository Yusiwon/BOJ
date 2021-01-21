package ¹éÁØ;

import java.util.Scanner;

public class p2442_º°Âï±â5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = n-1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (n-i)*2-1; j++){
				System.out.print("*");
			}
			System.out.println();
			input.close();
		}
	}

}

package BOJ;

import java.util.Scanner;

public class p14624_전북대학교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		if(n % 2 == 0) {
			System.out.println("I LOVE CBNU");
		}
		else {
			for(int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();

			for(int j = n/2; j >= 0; j--) {
				for(int k = 0; k < j; k++) 
					System.out.print(" ");

				System.out.print("*");


				for(int k = 0; k < (n/2-j)*2-1; k++) {
					System.out.print(" ");
				}
				if(n/2 != j)
					System.out.println("*");
				else System.out.println();

			}
		}
	}
}

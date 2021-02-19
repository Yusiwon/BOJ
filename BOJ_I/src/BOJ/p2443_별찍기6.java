package BOJ;

import java.util.Scanner;

public class p2443_º°Âï±â6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (n-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}

}

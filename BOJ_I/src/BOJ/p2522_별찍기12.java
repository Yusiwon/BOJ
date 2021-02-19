package BOJ;

import java.util.Scanner;

public class p2522_º°Âï±â12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for(int i = 1; i <= size; i++) {
			for(int j = size; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < size; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = size; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

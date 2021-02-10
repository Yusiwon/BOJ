package 백준;

import java.util.Scanner;

public class p9655_돌게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("CY");
		}
		else {
			System.out.println("SK");
		}
	}

}

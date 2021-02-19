package BOJ;

import java.util.Scanner;

public class p1182_부분수열의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		input.close();
		if(year % 4 == 0 && (year % 100 != 0 ||year % 400 == 0)) {
			System.out.println(1);
		}
		else
			System.out.println(0);
	}

}

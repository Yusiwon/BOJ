package BOJ;

import java.util.Scanner;

public class p8370_Plane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int n1 = input.nextInt();
		int k1 = input.nextInt();
		
		int result = (n*k) + (n1*k1);
		System.out.println(result);
	}

}

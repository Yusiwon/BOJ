package BOJ;

import java.util.Scanner;

public class p15963_CASIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		long n = input.nextInt();
		long m = input.nextInt();
		
		input.close();
		if(n==m)
			System.out.println("1");
		else 
			System.out.println("0");
	}

}

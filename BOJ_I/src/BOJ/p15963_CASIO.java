package BOJ;

import java.util.Scanner;

public class p15963_CASIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long m = input.nextLong();
		
		input.close();
		if(n==m)
			System.out.println("1");
		else 
			System.out.println("0");
	}

}

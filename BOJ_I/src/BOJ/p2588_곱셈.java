package BOJ;

import java.util.Scanner;

public class p2588_°ö¼À {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		input.nextLine();
		int n2 = input.nextInt();
		
		
		int n21 = n2/100;
		int n22 = (n2%100)/10;
		int n23 = n2%10;
		
		System.out.println(n1*n23);
		System.out.println(n1*n22);
		System.out.println(n1*n21);
		System.out.println(n1*n2);
		
		input.close();
	}

}

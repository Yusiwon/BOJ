package 백준;

import java.util.Scanner;

public class p15680_연세대학교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		input.close();
		if(n == 0) 
			System.out.println("YONSEI");
		else if(n == 1)
			System.out.println("Leading the Way to the Future");
	}

}

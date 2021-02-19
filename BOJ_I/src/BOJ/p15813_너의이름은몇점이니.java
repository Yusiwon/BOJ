package BOJ;

import java.util.Scanner;

public class p15813_너의이름은몇점이니 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		input.nextLine();
		char[] arr = new char[n];
		String str  = input.nextLine();
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] - 64;
		}
		System.out.println(sum);
		
		input.close();
	}

}

package 백준;

import java.util.Scanner;

public class p2748_피보나치수2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		input.close();
		long[] arr = new long[n+1];

		arr[0] = 0;
		arr[1] = 1;


		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}	
		System.out.println(arr[n]);


	}
}

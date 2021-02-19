package 백준;

import java.util.Scanner;

public class p2747_피보나치수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int[] arr = new int[number+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= number; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[number]);
		input.close();
	}

}

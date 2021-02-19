package BOJ;

import java.util.Scanner;

public class p11441_합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		int[] arr = new int[n+1];

		for(int i = 1; i < n+1; i++) {
			arr[i] = input.nextInt();
		}
		input.nextLine();
		int m = input.nextInt();
		
		for(int i = 0; i < m; i++) {
			int s = input.nextInt();
			int l = input.nextInt();
			
			
			int sum = 0;
			for(int j = s; j <= l; j++) {
				sum += arr[j];
			}
			
			System.out.println(sum);
		}
	}

}

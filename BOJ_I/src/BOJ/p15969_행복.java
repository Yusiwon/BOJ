package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class p15969_วเบน {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		int max = arr[n-1];
		int min = arr[0];
		
		System.out.println(max-min);
		
		input.close();
	}
	

}

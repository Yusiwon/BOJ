package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class p10818_최소최대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int s = 0; s < size; s++) {
			arr[s] = input.nextInt();	
		}
		int max = 0, min = 0;
		Arrays.sort(arr);
		max = arr[arr.length-1];
		min = arr[0];
		
		System.out.println(min + " " + max);
		input.close();
	}

}

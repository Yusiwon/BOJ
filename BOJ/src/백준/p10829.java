package น้มุ;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p10829 {
	static int n;
	static int[] arr;

	public static boolean next_permutation() {
		if(arr.length == 1)	return false;
		int indexi = arr.length-1;
		for(int i = arr.length-1; i > 0; i--) {
			if(arr[i-1] < arr[i]) {
				indexi = i;
				break;
			}
			if(i==1) return false;
		}


		int indexj = arr.length-1;
		for(int j = arr.length-1; j > 0; j--) {
			if(arr[indexi-1] < arr[j]) {
				indexj = j;
				break;
			}
		}

		int temp = 0;
		temp = arr[indexi-1];
		arr[indexi-1] = arr[indexj];
		arr[indexj] = temp;

		int range = (arr.length - indexi)/2;
		for(int i = 0; i < range; i++){
			temp = arr[indexi];
			arr[indexi++] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.nextLine();
		String line = input.nextLine();
		arr = new int[n];

		String[] str = line.split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int maxSum = 0;
		
		int range = 1;
		for(int i = 1; i <= n; i++)
			range *= i;
		
		int[] dif = new int[n-1];
		for(int i = 0; i < range; i++ ) {
			int sum = 0;
			for(int j = 0; i < arr.length-2; i++) {
				dif[j] = arr[j] - arr[j+1]; 
			}
			for(int j = 0; j < dif.length; j++) 
				sum += dif[j];
			
			if(sum >= maxSum)	maxSum = sum;
			next_permutation();
		}
		
		System.out.println(maxSum);
	}
}

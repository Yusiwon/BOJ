package 백준;

import java.util.Scanner;

public class p14490_백대열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().split(":");
		int[] arr = new int[2];
		
		for(int i = 0; i < 2; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int div = 0;
		if(arr[0] >= arr[1])	div = arr[1];
		else	div = arr[0];
		
		for(int i = div; i >= 2; i--) {
			if(arr[0] % i == 0 && arr[1] % i == 0) {
				arr[0] = arr[0] / i;
				arr[1] = arr[1] / i;
			}
		}
		
		System.out.print(arr[0]);
		System.out.print(":");
		System.out.println(arr[1]);
		
	}

}

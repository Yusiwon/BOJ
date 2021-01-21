package 백준;

import java.util.Scanner;

public class p17201_자석체인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] arr = new int[n*2];
		for(int i = 0; i < n*2; i += 2) {
			arr[i] = input.nextInt();
			arr[i+1] = input.nextInt();
		}
		input.close();
		
		boolean bool = true;
		int right = 0;
		for(int i = 0; i < n*2; i += 2) {
			if(right == arr[i]) {
				bool = false;
				break;
			}
			right = arr[i+2];
		}
		
		if(bool) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}

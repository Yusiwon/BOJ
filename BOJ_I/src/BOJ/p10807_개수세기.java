package BOJ;

import java.util.Scanner;

public class p10807_개수세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		
		input.nextLine();
		
		int find = input.nextInt();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == find) count++;
		}
		
		System.out.println(count);
		input.close();
	}

}

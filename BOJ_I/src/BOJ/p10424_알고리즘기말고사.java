package BOJ;

import java.util.Scanner;

public class p10424_알고리즘기말고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[][] arr = new int[n+1][2];
		for(int i = 1; i <= n; i++) {
			arr[i][1] = i;
			arr[i][0] = input.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			int b = 0, c = 0;
			for(int j = 1; j <= n; j++) {
				
				if(i == j) continue;
				
				if(arr[j][0] > arr[i][0] && arr[j][1] < arr[i][1]) {
					b++;
				}
				else if(arr[j][0] < arr[i][0] && arr[j][1] > arr[i][1]) {
					c++;
				}
				
			}
			System.out.println(b-c);
		}
	}

}

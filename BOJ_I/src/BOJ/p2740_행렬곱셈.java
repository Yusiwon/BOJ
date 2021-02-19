package BOJ;

import java.util.Scanner;

public class p2740_Çà·Ä°ö¼À {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		input.nextLine();
		
		int[][] fir = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				fir[i][j] = input.nextInt();
			}
			input.nextLine();
		}
		
		int l = input.nextInt();
		int k = input.nextInt();
		int[][] sec = new int[l][k];
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < k; j++) {
				sec[i][j] = input.nextInt();
			}
			input.nextLine();
		}
		
		int[][] ans = new int[n][k];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				for(int p = 0; p < m; p++) {
					ans[i][j] += fir[i][p] * sec[p][j];
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k-1; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println(ans[i][k-1]);
 		}
	}

}

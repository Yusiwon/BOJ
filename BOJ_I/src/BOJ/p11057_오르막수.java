package BOJ;

import java.util.Scanner;

public class p11057_오르막수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int mod = 10007;
		
		int[][] dp = new int[n+1][10];
		
		for(int i = 0; i < 10; i++) dp[1][i] = 1;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = 0; k <= j; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= mod;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i <= 9; i++) {
			ans += dp[n][i];
		}
		
		System.out.println(ans %= mod);
	}

}

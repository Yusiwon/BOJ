package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2775_부녀회장이될테야 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[15][15];
		
		for(int i = 1; i < 15; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		for(int p = 0; p < number; p++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(arr[k][n]);
		}
	}

}

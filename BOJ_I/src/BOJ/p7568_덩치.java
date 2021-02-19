package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p7568_µ¢Ä¡ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub\
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		for(int i =0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				
				if(i == j)	continue;
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			
			arr[i][2] = rank;
		}
		
		for(int i = 0; i < n ; i++) {
			System.out.print(arr[i][2]  + " ");
		}

	}

}

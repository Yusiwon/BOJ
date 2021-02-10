package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9085_더하기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n ; i++) {
			int sum = 0;
			int size = Integer.parseInt(br.readLine());
			
			String[] str = br.readLine().split(" ");
			int[] arr = new int[str.length];
			
			for(int j = 0; j < str.length; j++) {
				arr[j] = Integer.parseInt(str[j]);
				
				if(arr[j] <= 10) {
					sum += arr[j];
				}
			}
			System.out.println(sum);
		}

	}

}

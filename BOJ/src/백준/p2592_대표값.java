package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2592_대표값 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[1001];
		Arrays.fill(arr, 0);
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n]++;
			sum += n;
		}
		
		System.out.println(sum / 10);
		
		int max = 0; int mindex = 0;
		for(int i = 10; i < 1001; i += 10) {
			if(max < arr[i]) {
				max = arr[i];
				mindex = i;
			}
		}
		
		System.out.println(mindex);
	}

}

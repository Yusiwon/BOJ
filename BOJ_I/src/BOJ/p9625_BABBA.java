package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9625_BABBA {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int button = Integer.parseInt(br.readLine());
		
		int[] arr = new int[45];
		int[] brr = new int[45];
		
		arr[0] = 0;
		arr[1] = 1;
		brr[0] = 1;
		brr[1] = 1;
		
		for(int i = 2; i < 45; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			brr[i] = brr[i-1] + brr[i-2];
		}
		
		System.out.println(arr[button-1] + " " + brr[button-1]);
		
	}

}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9461_파도반수열 {

	static long[] arr = new long[101];
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		padovan();
		
		for(int i = 0; i < test; i++) {
			int b = Integer.parseInt(br.readLine());
			System.out.println(arr[b]);
		}

	}
	
	public static void padovan() {
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		for(int i = 4; i < 101; i++) {
			arr[i] = arr[i-2] + arr[i-3];
		}
	}

}

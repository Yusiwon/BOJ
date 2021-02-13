package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2965_캥거루세마리 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		int left = Integer.parseInt(arr[0]);
		int mid = Integer.parseInt(arr[1]);
		int right = Integer.parseInt(arr[2]);
		
		System.out.println(solve(left, mid, right));

	}
	
	public static int solve(int left, int mid, int right) {
		if(mid - left == 1 && right - mid == 1) {
			return 0;
		}
		
		int fixposition = findFixPosition(left, mid, right);
		
		return Math.abs(fixposition - mid) - 1;
	}
	public static int findFixPosition(int left, int mid, int right) {
		if(right - mid > mid - left) {
			return right;
		}
		else {
			return left;
		}
	}

}

package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class p1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int res = 0;
		
		for(int i = 0; i < n; i++)
			a[i] = input.nextInt();
		for(int i = 0; i < n; i++)
			b[i] = input.nextInt();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0; i < n ; i++) {
			res += a[i] * b[n-1-i];
		}
		System.out.println(res);
	}

}

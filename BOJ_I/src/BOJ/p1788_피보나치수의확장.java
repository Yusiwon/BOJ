package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1788_피보나치수의확장 {
	public static int[] data; 
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		int result = 0;
		data = new int[1000001];
		if(number == 0) {
			System.out.println(0);
			System.out.println(fibo(0));
		}
		else {
			if(number > 0)		
			System.out.println(1);	
		
		else if(number < 0) {
			System.out.println(-1);
			number = -number;
		}
		
		
		result = fibo(number);

		
		System.out.println((result%1000000000));
		}
		
	}

	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n <= 2) {
			return 1;
		}
		
		if(data[n] != 0) {
			return data[n];
		}
		else {
			data[n] = fibo(n-1) + fibo(n-2);
			return data[n];
		}
	}

}

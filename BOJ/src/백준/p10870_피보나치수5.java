package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10870_피보나치수5 {
	

	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(number));
	}
	
	public static int fibo(int n) {
		if(n == 0)	return 0;
		else if(n == 1)	return 1;
		else 	return fibo(n-1) + fibo(n-2);
	}

}

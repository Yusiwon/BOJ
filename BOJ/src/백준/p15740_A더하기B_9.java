package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p15740_A더하기B_9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		BigInteger a = new BigInteger(arr[0]);
		BigInteger b = new BigInteger(arr[1]);
		
		System.out.println(a.add(b));

	}

}

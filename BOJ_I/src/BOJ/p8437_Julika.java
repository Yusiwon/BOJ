package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class p8437_Julika {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		
		
		BigInteger Ba = new BigInteger(a);
		BigInteger Bb = new BigInteger(b);
		BigInteger two = new BigInteger("2");
		System.out.println(Ba.add(Bb).divide(two));
		System.out.println(Ba.subtract(Bb).divide(two));
	}

}

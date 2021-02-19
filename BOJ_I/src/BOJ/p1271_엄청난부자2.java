package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p1271_엄청난부자2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		BigInteger money = new BigInteger(str[0]);
		BigInteger al = new BigInteger(str[1]);
		
		
		System.out.println(money.divide(al));
		System.out.println(money.remainder(al));
	}

}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p14928_Å«¼ö {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		long remain = 0;
		for(int i = 0; i < n.length(); i++) {
			remain = (remain * 10 + (n.charAt(i) - '0')) % 20000303;
		}
		System.out.println(remain);
	}

}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11005_진법변환2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		StringBuilder sb = new StringBuilder();
		
		while(n > 0) {
			int remain = n % b;
			if(remain < 10) {
				sb.append((char)(remain + '0'));
			}
			else {
				sb.append((char)(remain - 10 + 'A'));
			}
			n /= b;
		}
		
		System.out.println(sb.reverse());

	}

}

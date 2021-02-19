package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2935_º“¿Ω {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String op = br.readLine();
		String b = br.readLine();
		
		if(a.length() < b.length()) {
			String temp = a;
			a = b; b = temp;
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(a);
		
		if(op.equals("*")) {
			for(int i = 0; i < b.length()-1; i++) {
				sb.append("0");
			}
		}
		else {
			if(a.length() == b.length()) {
				sb.setCharAt(0, '2');
			}
			else {
				sb.setCharAt(a.length() - b.length(), '1');
			}
		}
		System.out.println(sb.toString());
		

	}

}

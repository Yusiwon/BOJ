package πÈ¡ÿ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1225_¿ÃªÛ«—∞ˆº¿ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		String a = arr[0];
		String b = arr[1];
		
		long sum = 0; int f = 0; int s = 0;
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0; j < b.length(); j++) {
				f = (int)(a.charAt(i)-'0');
				s = (int)(b.charAt(j)-'0');
				sum += f * s;
			}
		}
		
		System.out.println(sum);

	}

}

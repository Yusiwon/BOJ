package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2476_주사위게임 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		int result = 0;
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a == b && b == c) {
				result = 10000 + a*1000;
			}
			else if(a == b) {
				result = 1000 + a*100;
			}
			else if(b == c) {
				result = 1000 + b*100;
			}
			else if(a == c) {
				result = 1000 + a*100;
			}
			else {
				int big = Math.max(Math.max(a, b),c);
				result = big*100;
			}
			
			if(result > max)	max = result;
		}
		
		System.out.println(max);

	}

}

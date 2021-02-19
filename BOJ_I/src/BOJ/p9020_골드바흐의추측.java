package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9020_∞ÒµÂπŸ»Â¿«√ﬂ√¯ {

	static boolean[] prime = new boolean[10001];
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		getPrime();
		
		for(int i = 0; i < n; i++) {
			int now = Integer.parseInt(br.readLine());
			int left = now / 2;
			int right = now / 2;
			
			while(prime[left] || prime[right]) {
				left--;
				right++;
			}
			
			System.out.println(left + " " + right);
		}

	}
	
	public static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i*i < prime.length; i++) {
			if(!prime[i]) {
				for(int j = i*i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}
		}
	}

}

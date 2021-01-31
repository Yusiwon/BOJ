package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4948_베르트랑공준 {

	static boolean[] prime;
	static int start;
	static int end;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			start = Integer.parseInt(br.readLine());
			end = 2 * start;
			
			if(start == 0)	break;
			
			prime = new boolean[2*start+1];
			prime[0] = true;	prime[1] = true;
			
			era();
			
			int count = 0;
			for(int i = start+1; i <= end; i++) {
				if(!prime[i])	count++;
			}
			
			System.out.println(count);
		}

	}
	
	public static void era() {
		for(int i = 2; i*i <= end; i++) {
			if(!prime[i]) {
				for(int j = i*i; j <= end; j += i) {
					prime[j] = true;
				}
			}
		}
	}

}

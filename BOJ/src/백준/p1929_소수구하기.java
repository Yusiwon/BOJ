package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1929_소수구하기 {
	public static boolean[] prime;
	public static int start;
	public static int end;
	public static void main(String[] args) throws IOException{
		// 에라토스테네스의 체

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		start = Integer.parseInt(str[0]);
		end = Integer.parseInt(str[1]);
		
		prime = new boolean[end+1];
		prime[0] = true;	// 소수 = false
		prime[1] = true;
		
		에라토스테네스의체();
		
		for(int i = start; i <= end; i++) {
			if(!prime[i])	System.out.println(i);
		}
	}
	
	public static void 에라토스테네스의체() { // 소수구하는 알고리즘이름
		for(int i = 2; i*i <= end; i++) {
			if(!prime[i]) { // prime[i]가 소수일때
				for(int j = i*i; j <= end; j += i) {
					prime[j] = true;
				}
			}
		}
	}

}

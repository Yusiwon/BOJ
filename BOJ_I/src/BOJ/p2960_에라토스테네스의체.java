package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2960_에라토스테네스의체 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int end = Integer.parseInt(str[0]);
		int number = Integer.parseInt(str[1]);

		boolean[] prime = new boolean[end+1];
		int count = 0;


		for(int i = 2; i <= end; i++) {
			if(!prime[i]) {
				for(int j = i; j <= end; j += i) {
					if(!prime[j]) {
						prime[j] = true;
						count++;
					}

					if(count == number) {
						System.out.println(j);
						break;
					}

				}
			}
		}	
	}
}



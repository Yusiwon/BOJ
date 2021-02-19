package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2231_ºÐÇØÇÕ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		int index = 0;
		for(int i = 1; i < number; i++) {
			int now = i;
			int sum = i;
			
			while(now != 0) {
				sum += now % 10;
				now /= 10;
			}
			
			if(sum == number) {
				index = i;
				break;
			}
		}
		
		
		System.out.println(index);
	}

}

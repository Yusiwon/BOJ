package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2406_지능형기차2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int max = 0;
		for(int i = 0; i < 10; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			sum -= a;
			sum += b;
			if(sum > max)	max = sum;
		}
		System.out.println(max);
	}

}

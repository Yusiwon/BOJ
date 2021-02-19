package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2010_ÇÃ·¯±× {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		int sum = 1;
		for(int i = 0; i < count; i++) {
			int plug = Integer.parseInt(br.readLine());
			sum += plug - 1;
		}
		
		System.out.println(sum);

	}

}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12790_Mini_Fantasy_war {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n ; i++) {
			String[] str = br.readLine().split(" ");
			int[] arr = new int[str.length];
			
			for(int j = 0; j < str.length; j++) {
				arr[j] = Integer.parseInt(str[j]);
			}
			
			int hp = arr[0] + arr[4];
			int mp = arr[1] + arr[5];
			int off = arr[2] + arr[6];
			int dep = arr[3] + arr[7];
			
			if(hp < 1)	hp = 1;
			if(mp < 1)	mp = 1;
			if(off < 0)	off = 0;
			
			int sum = 1*hp + 5*mp + 2*off + 2*dep;
			
			System.out.println(sum);
		}

	}

}

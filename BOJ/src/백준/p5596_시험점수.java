package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5596_시험점수 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] manstr = br.readLine().split(" ");
		String[] minstr = br.readLine().split(" ");
		
		int[] man = new int[4];
		int[] min = new int[4];
		int mansum = 0; int minsum = 0;
		for(int i = 0; i < 4; i++) {
			man[i] = Integer.parseInt(manstr[i]);
			mansum += man[i];
			min[i] = Integer.parseInt(minstr[i]);
			minsum += min[i];
		}
		
		if(mansum == minsum) {
			System.out.println(mansum);
		}
		else {
			System.out.println(Math.max(mansum, minsum));
		}

	}

}

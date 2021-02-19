package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10178_할로윈의사탕 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			int c = Integer.parseInt(str[0]);
			int v = Integer.parseInt(str[1]);
			
			System.out.println("You get " + (c/v) + " piece(s) and your dad gets " + (c%v) + " piece(s).");
		}

	}

}

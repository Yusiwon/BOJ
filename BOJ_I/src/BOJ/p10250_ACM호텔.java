package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10250_ACMÈ£ÅÚ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int height, width, n, dong, ho;
		
		for(int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" ");
			height = Integer.parseInt(str[0]);
			width = Integer.parseInt(str[1]);
			n = Integer.parseInt(str[2]);
			
			dong = n % height;
			ho = n / height + 1;
			
			if(dong == 0) {
				dong = height;
				ho--;
			}
			
			if(ho >= 10) {
				System.out.println(dong + "" + ho);
			}
			else {
				System.out.println(dong + "0" + ho);
			}
			
		}
		
		

	}

}

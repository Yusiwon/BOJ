package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10162_전자레인지 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());

		if(time % 10 != 0 ) {
			System.out.println(-1);
		}
		else {
			int a = time / 300;

			int b = time % 300;
			b /= 60;
			
			int c = time % 60;
			c /= 10;
			
			System.out.println(a + " " + b + " " + c);
		}

	}

}

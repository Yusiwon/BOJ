package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10214_Baseball {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());

		for(int i = 0; i < test; i++) {
			int y = 0; int k = 0;
			for(int j = 0; j < 9; j++) {
				String[] str = br.readLine().split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				
				y += a;
				k += b;
			}
			
			if(y > k) {
				System.out.println("Yonsei");
			}
			else if(y < k) {
				System.out.println("Korea");
			}
			else {
				System.out.println("Draw");
			}

		}

	}

}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p1075_나누기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());

		if(n < 100) {
			
			for(int i = n; i < 100; i++) {
				if(i % f == 0) {
					System.out.println(i);	break;
				}
			}
		}
		else {
			n = n / 100 * 100;

			for(int i = 0; i < 100; i++) {
				if((n+i) % f == 0) {
					if(i < 10) {
						System.out.println("0" + i);
					}
					else {
						System.out.println(i);
					}
					break;
				}
			}
		}


	}

}

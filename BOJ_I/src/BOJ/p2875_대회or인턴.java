package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2875_대회or인턴 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);

		if(n+m == k) {
			System.out.println(0);
		}
		else {
			int team = 0;
			while(n >= 2 && m >= 1) {
				n -= 2;
				m -= 1;
				team++;
			}

			if(n+m >= k) {
				System.out.println(team);
			}
			else {
				while(true) {
					team--;
					n += 2;
					m += 1;

					if(n+m >= k) {
						break;
					}
				}
				System.out.println(team);
			}
		}


	}

}

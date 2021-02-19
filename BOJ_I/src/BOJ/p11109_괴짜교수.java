package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11109_±«Â¥±³¼ö {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < m; i++) {
			String[] str = br.readLine().split(" ");
			int d = Integer.parseInt(str[0]);
			int n = Integer.parseInt(str[1]);
			int s = Integer.parseInt(str[2]);
			int p = Integer.parseInt(str[3]);
			
			int pa = d + (n*p);
			int npa = n*s;
			
			if(pa == npa) {
				System.out.println("does not matter");
			}
			else if(pa < npa) {
				System.out.println("parallelize");
			}
			else {
				System.out.println("do not parallelize");
			}
		}

	}

}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9610_사분면 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int q1 = 0; int q2 = 0; int q3 = 0; int q4 = 0;
		int axis = 0;
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			
			long x = Long.parseLong(str[0]);
			long y = Long.parseLong(str[1]);
			
			if(x == 0 || y == 0) {
				axis++;
			}
			else if(x > 0 && y > 0) {
				q1++;
			}
			else if(x < 0 && y > 0) {
				q2++;
			}
			else if(x < 0 && y < 0) {
				q3++;
			}
			else if(x > 0 && y < 0){
				q4++;
			}
		}
		
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);

	}

}

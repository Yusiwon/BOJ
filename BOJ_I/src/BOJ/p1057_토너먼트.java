package BOJ;

import java.util.Scanner;

public class p1057_토너먼트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int jimin = input.nextInt();
		int hansoo = input.nextInt();
		
		int count = 0;
		while(jimin != hansoo) {
			jimin = jimin/2 + jimin%2;
			hansoo = hansoo/2 + hansoo%2;
			
			count++;
		}
		
		System.out.println(count);
		input.close();
	}

}

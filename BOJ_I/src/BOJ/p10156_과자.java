package BOJ;

import java.util.Scanner;

public class p10156_°úÀÚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int n = input.nextInt();
		int m = input.nextInt();
		
		int buy = 1;
		buy = k * n;
		int need = 0;
		if(m < buy) {
			need = buy - m; 
		}
		System.out.println(need);
		input.close();
	}

}

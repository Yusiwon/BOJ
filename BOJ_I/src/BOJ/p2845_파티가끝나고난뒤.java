package BOJ;

import java.util.Scanner;

public class p2845_��Ƽ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int p = input.nextInt();
		
		
		int pe = l*p;
		for(int i = 0; i < 5; i++) {
			int n = input.nextInt();
			System.out.print(n-pe + " ");
		}
	}

}

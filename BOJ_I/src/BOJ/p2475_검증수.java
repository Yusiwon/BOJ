package BOJ;

import java.util.Scanner;

public class p2475_°ËÁõ¼ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int sum = 0; int num = 0;
		for(int i = 0; i < 5; i++) {
			num = input.nextInt();
			sum += num*num;
		}
		System.out.println(sum%10);
	}

}

package 백준;

import java.util.Scanner;

public class p1475_검증수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int sum = 0; int num = 0;
		for(int i = 0; i < 5; i++) {
			num = input.nextInt();
			sum += Math.pow(num, 2);
		}
		System.out.println(sum%10);
	}

}

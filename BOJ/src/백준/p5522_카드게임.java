package 백준;

import java.util.Scanner;

public class p5522_카드게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int sum = 0; int n = 0;
		for(int i = 0; i < 5; i++) {
			n = input.nextInt();
			sum += n;
		}
		
		System.out.println(sum);
	}

}

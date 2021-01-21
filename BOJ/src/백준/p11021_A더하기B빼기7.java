package 백준;

import java.util.Scanner;

public class p11021_A더하기B빼기7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for(int i = 1; i <= size; i++) {
			int first = input.nextInt();
			int second = input.nextInt();
			
			System.out.println("Case #" + i + ": " + (first+second));
		}
	}

}

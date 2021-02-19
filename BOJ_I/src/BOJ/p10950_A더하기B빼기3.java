package 백준;

import java.util.Scanner;

public class p10950_A더하기B빼기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		
		for(int i = 0; i < size; i++) {
			int first = input.nextInt();
			int second = input.nextInt();
			
			System.out.println(first+second);

		}
		input.close();
	}

}

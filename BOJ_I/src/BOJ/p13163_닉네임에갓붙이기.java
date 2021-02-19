package BOJ;

import java.util.Scanner;

public class p13163_닉네임에갓붙이기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		input.nextLine();

		for(int i = 0; i < number; i++) {
			String str = input.nextLine();
			String[] arr = str.split(" ");

			System.out.print("god");
			for(int j = 1; j < arr.length; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}

}

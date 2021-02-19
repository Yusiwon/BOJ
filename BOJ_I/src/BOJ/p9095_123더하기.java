package 백준;

import java.util.Scanner;

public class p9095_123더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[11];

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();

		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;

		for(int s = 0; s < size; s++) {
			int number = input.nextInt();
			for(int i = 4; i <= number; i++) {
				arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
			}
			System.out.println(arr[number]);
		}
		input.close();
	}

}

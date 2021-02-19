package BOJ;

import java.util.Scanner;

public class p3003_Å·Äý·èºñ¼ó³ªÀÌÆ®Æù {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] arr = new int[6];
		
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 2;
		arr[5] = 8;
		
		int number = 0;
		for(int i = 0; i < 6; i++) {
			number = input.nextInt();
			
			System.out.print(arr[i] - number + " ");
		}
	}

}

package BOJ;

import java.util.Scanner;

public class p10953_A¥ı«œ±‚Bª©±‚6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < size; i++) {
			String[] str = input.nextLine().split(",");
			int first = Integer.parseInt(str[0]);
			int second = Integer.parseInt(str[1]);

			System.out.println(first+second);
		}
		input.close();
	}

}

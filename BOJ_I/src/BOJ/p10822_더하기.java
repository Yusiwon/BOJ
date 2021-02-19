package BOJ;

import java.util.Scanner;

public class p10822_¥ı«œ±‚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().split(",");
		int sum = 0;
		for(int i = 0; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);
		input.close();
	}

}

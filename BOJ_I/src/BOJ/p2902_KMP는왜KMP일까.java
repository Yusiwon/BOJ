package BOJ;

import java.util.Scanner;

public class p2902_KMP는왜KMP일까 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().split("-");
		
		for(int i = 0; i < str.length; i++) {
			char ch = str[i].charAt(0);
			System.out.print(ch);
		}
	}

}

package BOJ;

import java.util.Scanner;

public class p2744_대소문자바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch <= 90 && 65 <= ch) {
				System.out.print((char)(ch+32));
			}
			else if(ch <= 122 && 97 <= ch) {
				System.out.print((char)(ch-32));
			}
		}
	}

}

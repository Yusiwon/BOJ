package BOJ;

import java.util.Scanner;

public class p9086_¹®ÀÚ¿­ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str= input.nextLine();
			char fir = str.charAt(0);
			char la =str.charAt(str.length()-1);
			System.out.print(fir);
			System.out.println(la);
		}
	}

}

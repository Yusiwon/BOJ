package 백준;

import java.util.Scanner;

public class p1264_모음의개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		while(true) {
			String str = input.nextLine().toLowerCase();
			if(str.equals("#")) {
				break;
			}
			
			int count = 0;
			for(int i = 0; i < str.length();i++) {
				char ch = str.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}

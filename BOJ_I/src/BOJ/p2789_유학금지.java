package 백준;

import java.util.Scanner;

public class p2789_유학금지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		char[] ch = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
		
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == ch[j]) {
					sb.deleteCharAt(i);
					break;
				}
				
				
			}
		}
		
		System.out.println(sb.toString());
	}

}

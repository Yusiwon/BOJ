package BOJ;

import java.util.Scanner;

public class p5622_´ÙÀÌ¾ó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		input.close();
		int time = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'C') {
				time += 3;
			}
			else if(ch >= 'D' && ch <= 'F') {
				time += 4;
			}
			
			else if(ch >= 'G' && ch <= 'I') {
				time += 5;
			}
			
			else if(ch >= 'J' && ch <= 'L') {
				time += 6;
			}
			
			else if(ch >= 'M' && ch <= 'O') {
				time += 7;
			}
			
			else if(ch >= 'P' && ch <= 'S') {
				time += 8;
			}
			
			else if(ch >= 'T' && ch <= 'V') {
				time += 9;
			}
			
			else if(ch >= 'W' && ch <= 'Z') {
				time += 10;
			}
		}
		
		System.out.println(time);
	}

}

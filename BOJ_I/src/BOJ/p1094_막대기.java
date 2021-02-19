package BOJ;

import java.util.Scanner;

public class p1094_¸·´ë±â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int st = input.nextInt();
		
		int count = 0;
		int compare = 0;
		int length = 32;
		
		if(st == 64) {
			count = 1;
		}
		else {
			while(true) {
				if(st == compare + length) {
					count++;
					break;
				}
				
				else if(st > compare + length) {
					compare += length;
					count++;
					length = length / 2;
				}
				
				else if (st < compare + length) {
					length = length / 2;
				}
			}
		}
		
		System.out.println(count);
		input.close();
	}

}

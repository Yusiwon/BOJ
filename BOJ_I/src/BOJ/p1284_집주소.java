package BOJ;

import java.util.Scanner;

public class p1284_ÁýÁÖ¼Ò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		while(true) {
			int number = input.nextInt();
			
			if(number == 0)	break;
			
			int size = 0; int i = 0;
			
			if(number >= 1000) {
				size = 5;
				i = 1000;
			}
			else if(number >= 100) {
				size = 4;
				i = 100;
			}
			else if(number >= 10) {
				size = 3;
				i = 10;
			}
			else if(number >= 1) {
				size = 2;
				i = 1;
			}
			
			for(int j = i; j >= 1; j /= 10) {
				int now = number/j;
				number = number % j;
				
				if(now == 1)	size += 2;
				else if(now == 0)	size += 4;
				else	size += 3;
			}
			
			System.out.println(size);
		}
	}

}

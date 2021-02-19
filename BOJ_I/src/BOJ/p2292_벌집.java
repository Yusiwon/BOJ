package BOJ;

import java.util.Scanner;

public class p2292_¹úÁı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if(number == 1)
			System.out.println("1");
		else {
			for(int i = 1; i < 100000; i++) {
				int j = i * 6 ;
				number = number - j;
				if(number <= 1) {
					System.out.println(i+1);
					break;
				}
			}
		}
		input.close();
	}

}

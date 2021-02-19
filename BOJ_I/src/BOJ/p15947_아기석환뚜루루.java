package BOJ;

import java.util.Scanner;

public class p15947_아기석환뚜루루 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int s = input.nextInt();

		String[] str = {"sukhwan","baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby"};


		int cycle = s / 14;
		int remain = s % 14;

		//3, 4, 7, 8, 11, 12
		if(remain == 3 || remain == 4 || remain ==7 
				||remain == 8 || remain ==11 || remain == 12) {
			if(cycle < 3) {
				System.out.print(str[remain]);

				for(int i = 0; i < cycle; i++) {
					System.out.print("ru");
				}
				System.out.println();
			}
			else {
				if(remain % 2 == 1) {
					System.out.println("tu+ru*" + (cycle+2));
				}
				else {
					System.out.println("tu+ru*" + (cycle+1));
				}

			}
		}
		else {
			System.out.println(str[remain]);
		}	







		input.close();
	}
}


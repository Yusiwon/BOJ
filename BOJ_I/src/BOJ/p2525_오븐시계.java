package BOJ;

import java.util.Scanner;

public class p2525_¿Àºì½Ã°è {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int min = input.nextInt();
		input.nextLine();
		int need = input.nextInt();
		
		min += need;
		if(min >= 60) {
			hour++;
			min %= 60;
		}
		
		if(hour >= 24) {
			hour %= 24;
		}
		
		System.out.print(hour + " " + min);
		input.close();
	}

}

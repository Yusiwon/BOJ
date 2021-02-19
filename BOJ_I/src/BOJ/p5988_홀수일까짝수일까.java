package BOJ;

import java.util.Scanner;

public class p5988_È¦¼öÀÏ±îÂ¦¼öÀÏ±î {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < size; i++) {
			String number = input.nextLine();
			if(number.charAt(number.length()-1)%2 == 1) {
				System.out.println("odd");
			}
			else {
				System.out.println("even");
			}
		}
		input.close();
	}

}

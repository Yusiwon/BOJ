package 백준;

import java.util.Scanner;

public class p1748_수이어쓰기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(i <= 9) {
				count++;
			}
			else if (i <= 99) {
				count += 2;
			}
			else if(i <= 999) {
				count += 3;
			}
			else if(i <= 9999) {
				count += 4;
			}
			else if(i <= 99999) {
				count += 5;
			}
			else if(i <= 999999) {
				count += 6;
			}
			else if(i <= 9999999) {
				count += 7;
			}
			else if(i <= 9999999) {
				count += 8;
			}
			else if(i == 100000000) {
				count += 9;
			}
		}
		System.out.println(count);
		input.close();
	}

}

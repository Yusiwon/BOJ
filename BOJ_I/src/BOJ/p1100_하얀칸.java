package ¹éÁØ;

import java.util.Scanner;

public class p1100_ÇÏ¾áÄ­ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] arr = new char[8][8];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 8; i++) {
			String str = input.nextLine();
			for(int j = 0; j < 8; j++) {
				arr[i][j] = str.charAt(j);

			}
		}

		int count = 0;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(arr[i][j] == 'F')
					if(i%2 == 0) {
						if(j%2 == 0) {
							count++;
						}
					}
					else {
						if(j%2 == 1) {
							count++;
						}
					}
			}
		}

		System.out.println(count);
		input.close();
	}
}

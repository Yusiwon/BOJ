package ����;

import java.util.Scanner;

public class p10952_A���ϱ�B����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		while(true) {
			int first = input.nextInt();
			int second = input.nextInt();

			if(first == 0 && second == 0) {
				break;
			}
			else
				System.out.println(first+second);
		}
	}

}

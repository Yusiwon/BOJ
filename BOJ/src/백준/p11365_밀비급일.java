package ����;

import java.util.Scanner;

public class p11365_�к���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String str = input.nextLine();
			if(str.equals("END")) {
				break;
			}
			else {
				for(int i = str.length()-1; 0 <= i;i--) {
					System.out.print(str.charAt(i));

				}
				System.out.println();
			}
		}
	}

}

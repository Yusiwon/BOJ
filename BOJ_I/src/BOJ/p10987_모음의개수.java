package BOJ;

import java.util.Scanner;

public class p10987_�����ǰ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'a'
				||  str.charAt(i) == 'e'
				||	str.charAt(i) == 'i'
				||	str.charAt(i) == 'o'
				||	str.charAt(i) == 'u') {
				count++;
			}
		}
		
		System.out.println(count);
		input.close();
	}

}

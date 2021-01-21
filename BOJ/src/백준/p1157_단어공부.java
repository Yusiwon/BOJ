package 백준;

import java.util.Scanner;

public class p1157_단어공부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] count = new int[26];
		int number = 0;
		char an = '?';
		
		String word = input.next().toUpperCase();
		
		for(int i = 0; i < word.length(); i++) {
			count[word.charAt(i)-65]++;
			if(number < count[word.charAt(i)-65]) {
				an = word.charAt(i);
				number = count[word.charAt(i)-65];
			}
			else if(number== count[word.charAt(i)-65]) {
				an = '?';
			}
		}
		System.out.println(an);
		input.close();
	}

}

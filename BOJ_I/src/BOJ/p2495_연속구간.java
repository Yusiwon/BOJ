package BOJ;

import java.util.Scanner;

public class p2495_연속구간 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String[] arr = new String[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = input.nextLine();
		}
		for(int i = 0; i < 3; i++) {
			int count = 1, answer = 1;
			String str = arr[i];

			for(int j = 0; j < str.length()-1; j++) {
				if(str.charAt(j) == str.charAt(j+1)){
					count++;
				}
				else {
					if(count > 1) {
						answer = compare(count, answer);
						count = 1;
					}
				}

			}
			answer = compare(count, answer);
			System.out.println(answer);
		}
	}
	public static int compare(int count, int com) {
		if(count >= com) 
			return count;

		else
			return com;
	}

}

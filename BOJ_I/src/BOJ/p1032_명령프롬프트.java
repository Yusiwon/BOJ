package 백준;
import java.util.Scanner;

public class p1032_명령프롬프트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		char[] chars = input.next().toCharArray();
		
		for(int i = 1; i < n; i++) {
			String temp = input.next();
			for(int j = 0; j < chars.length; j++) {
				if(chars[j] != temp.charAt(j)) {
					chars[j] = '?';
				}
			}
		}
		System.out.println(String.valueOf(chars));
	}

}

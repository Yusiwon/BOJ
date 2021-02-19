package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class p9012_°ýÈ£ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();

		boolean print = false;
		for(int i = 0; i < n; i++) {
			Stack<Character> s = new Stack<>();
			String str = input.nextLine();

			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					s.push(str.charAt(j));
				}
				else if(str.charAt(j) == ')') {
					if(!s.isEmpty())
						s.pop();
					else {
						System.out.println("NO");
						print = true;
						break;
					}
				}
			}

			
			if(!print){
				if(s.size() == 0) {
					System.out.println("YES");
				}
				else
					System.out.println("NO");

			}
			print = false;
		}

	}
}
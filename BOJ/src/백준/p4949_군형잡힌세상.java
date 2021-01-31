package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Stack;

public class p4949_군형잡힌세상 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String str = br.readLine();

			if(str.charAt(0) == '.')	break;

			Stack<Character> stack = new Stack<>();
			char ch, now;
			boolean bool = true;
			for(int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);

				if(ch == '(' || ch == '[') {
					stack.push(ch);
				}

				if(ch == ')') {
					if(stack.size() == 0) {
						bool = false;
						break;
					}
					
					now = stack.pop();
					if(now != '(') {
						bool = false;
						break;
					}
				}
				else if(ch == ']') {
					if(stack.size() == 0) {
						bool = false;
						break;
					}
					now = stack.pop();
					if(now != '[') {
						bool = false;
						break;
					}
				}
				
				
			}
			if(stack.size() != 0) {
				bool = false;
			}
		if(bool)	System.out.println("yes");
		else		System.out.println("no");
		}

	}

}

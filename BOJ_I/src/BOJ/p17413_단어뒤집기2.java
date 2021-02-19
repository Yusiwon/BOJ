package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p17413_단어뒤집기2 {

	static Stack<Character> stack;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		stack = new Stack<>();
		char ch;	boolean bool = false;
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			if(bool) {
				if(ch == '>') {
					bool = false;
				}
				
				System.out.print(ch);
			}
			else {
				if(ch == ' ') {
					printS();
					System.out.print(" ");
				}	
				else if(ch == '<') {
					if(stack.size() != 0) {
						printS();	
					}
					System.out.print(ch);
					bool = true;
				}
				else {
					stack.push(ch);
				}
			}
		}
		printS();


	}

	public static void printS() {
		int size = stack.size();
		for(int i = 0; i < size; i++) {
			System.out.print(stack.pop());
		}
	}

}

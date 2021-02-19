package 백준;

import java.util.Scanner;
import java.util.Stack;

public class p10773_제로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < num; i++) {
			int n = input.nextInt();
			
			if(n == 0) {
				st.pop();
			}
			else
				st.push(n);
		}
		int sum = 0;
		while(st.empty() == false) {
			sum += st.pop();
		}
		
		System.out.println(sum);
		input.close();
	}

}

package น้มุ;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class p10866_ตฆ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.nextLine();
		
		Deque<Integer> de = new LinkedList<>();
		for(int i = 0; i < num; i++) {
			String com = input.next();
			
			if(com.equals("push_front")) {
				int n = input.nextInt();
				de.addFirst(n);
			}
			
			else if(com.equals("push_back")){
				int n = input.nextInt();
				de.addLast(n);
			}
			
			else if(com.equals("pop_front")) {
				if(de.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(de.pop());
				}
			}
			
			else if (com.equals("pop_back")) {
				if(de.isEmpty())
					System.out.println(-1);
				else
					System.out.println(de.pollLast());
			}
			
			else if (com.equals("size")) {
				System.out.println(de.size());
			}
			
			else if(com.equals("empty")) {
				if(de.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			
			else if(com.equals("front")) {
				if(de.isEmpty())
					System.out.println(-1);
				else
					System.out.println(de.peekFirst());
			}
			
			else if(com.equals("back")) {
				if(de.isEmpty())
					System.out.println(-1);
				else
					System.out.println(de.peekLast());
			}
				
				
		}
	}

}

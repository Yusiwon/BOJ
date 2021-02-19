package 백준;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p11866_조세퍼스문제0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		input.close();
		List<Integer> list = new LinkedList<>();

		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		int count = 0;
		System.out.print("<");
		while(list.size() > 1) {
count++;
			if(count < k) {
				list.add(list.get(0));
				list.remove(0);
			}
			else if(count == k) {
				System.out.print(list.get(0) + ", ");
				list.remove(0);
				count = 0;
			}
			
		}
		System.out.println(list.get(0) + ">");
	}

}

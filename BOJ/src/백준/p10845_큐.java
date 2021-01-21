package น้มุ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p10845_ลฅ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < size; i++) {
			String str = input.next();
			
			if(str.equals("push")) {
				int number = input.nextInt();
				list.add(number);
			}
			else if(str.equals("pop")) {
				if(list.size() == 0) {
					System.out.println("-1");
				}
				else {
					System.out.println(list.get(0));
					list.remove(0);
				}
			}
			else if(str.equals("size")) {
				System.out.println(list.size());
			}
			else if(str.equals("empty")) {
				if(list.size() == 0) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if(str.equals("front")) {
				if(list.size() == 0) {
					System.out.println("-1");
				}
				else {
					System.out.println(list.get(0));
				}
			}
			else if(str.equals("back")) {
				if(list.size() == 0) {
					System.out.println("-1");
				}
				else {
					System.out.println(list.get(list.size()-1));
				}
			}
			input.nextLine();
		}
		input.close();
	}

}

package 백준;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2164_카드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}

		while(list.size() > 1) {

			list.remove(0);
			int back = list.get(0);
			list.remove(0);
			list.add(back);
		}
		System.out.println(list.get(0));
		input.close();
	}

}

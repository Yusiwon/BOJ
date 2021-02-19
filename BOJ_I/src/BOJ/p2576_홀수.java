package น้มุ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p2576_ศฆผ๖ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < 7; i++) {
			int n = input.nextInt();

			if(n % 2 == 1) {
				list.add(n);
			}
		}

		input.close();

		if(list.size() == 0) {
			System.out.println(-1);
		}
		else {
			int sum = 0;
			for(int i = 0; i < list.size(); i++) {
				sum += list.get(i);
			}

			Collections.sort(list);
			System.out.println(sum);
			System.out.println(list.get(0));
		}	
	}

}

package 백준;

import java.util.Scanner;

public class p1934_최소공배수 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		for(int s = 0; s < size; s++) {
			int min = 1, number = 0;
			int first = input.nextInt();
			int second = input.nextInt();

			if(first == 1) min = second;
			else if(second == 1) min = first;
			else {
				if(first >= second) number = first;
				else number = second;

				for(int i = 2; i < number; i++) {
					if(first % i == 0 && second % i == 0) {
						min = min * i;
						first = first / i;
						second = second / i;
					}
				}
				min  = min * first * second;
			}
			System.out.println(min);
		}
	}

}

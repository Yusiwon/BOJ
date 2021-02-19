package BOJ;

import java.util.Scanner;

public class p7572_°£Áö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		int[] a = new int[10];
		char[] b = new char[12];

		for(int i = 0; i < 10; i ++) {
			a[i] = i;
		}
		for(int i = 0; i < 12; i++) {
			b[i] = (char)(65 + i);
		}

		int an = 0, bn = 0;
		if(year <= 2013) {
			int n = year-2014;
			an = n;
			bn = n+6;

			while (an < 0) {
				an += 10;
			}

			while (bn < 0) {
				bn += 12;
			}
		}
		else {
			int n = year-2014;
			an = n;
			bn = n+6;

			while (an > 9) {
				an -= 10;
			}

			while (bn > 11) {
				bn -= 12;
			}

		}
		System.out.print(b[bn]);
		System.out.print(a[an]);

		input.close();
	}

}

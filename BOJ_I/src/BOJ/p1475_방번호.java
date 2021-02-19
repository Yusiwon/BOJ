package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class p1475_¹æ¹øÈ£ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().split("");
		int[] arr = new int[str.length];

		for(int i = 0; i < str.length; i++) {
			arr[i] =  Integer.parseInt(str[i]);
		}

		int[] n = new int[10];

		for(int i = 0; i < str.length; i++) {
			n[arr[i]]++;
		}

		int k = n[6]+n[9];

		if(k % 2 == 0) {
			n[6] = k / 2;
			n[9] = k / 2;
		}
		else {
			n[6] = k / 2 + 1;
			n[9] = k / 2 + 1;
		}
		Arrays.sort(n);

		System.out.println(n[9]);
		input.close();
	}

}

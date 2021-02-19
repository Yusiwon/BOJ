package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class p1085_직사각형에서탈출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int x  = input.nextInt();
		int y = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		
		int[] arr = new int[4];
		
		arr[0] = x;
		arr[1] = y;
		arr[2] = w-x;
		arr[3] = h-y;
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		input.close();
	}

}

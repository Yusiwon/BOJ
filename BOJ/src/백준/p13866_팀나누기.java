package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class p13866_팀나누기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] arr = new int[4];
		
		for(int i = 0; i < 4; i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		int min = (arr[3] + arr[0]) - (arr[1] + arr[2]);
		System.out.println(Math.abs(min));
	}

}

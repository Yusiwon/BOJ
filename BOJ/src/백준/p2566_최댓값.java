package 백준;

import java.util.Scanner;

public class p2566_최댓값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int max = 0, x = 0, y = 0;
		int[][] arr = new int[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = input.nextInt();
				
				if(max < arr[i][j]){
					max = arr[i][j];
					x=i;
					y=j;
				}
			}
			
		}
		
		
		System.out.println(max);
		System.out.println(++x + " " + ++y);
	}

}

package BOJ;

import java.util.Scanner;

public class p15953_ªÛ±›«Â≈Õ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
		arr[i][0] = input.nextInt();
		arr[i][1] = input.nextInt();
		input.nextLine();
		}
		
		int[] pri17 = new int[6];
		int[] pri18 = new int[5];
		int[] arr17 = new int[6];
		int[] arr18 = new int[5];
		
		pri17[0] = 5000000;
		pri17[1] = 3000000;
		pri17[2] = 2000000;
		pri17[3] = 500000;
		pri17[4] = 300000;
		pri17[5] = 100000;
		
		pri18[0] = 5120000;
		pri18[1] = 2560000;
		pri18[2] = 1280000;
		pri18[3] = 640000;
		pri18[4] = 320000;
		
		for(int i = 0; i < 6; i++) {
			arr17[i] = i+1;
		}
		
		for(int i = 0; i < 5; i++)
		{
			arr18[i] =(int)Math.pow(2, i);
		}
		
		for(int i = 0; i < n; i++) {
			int lev17 = arr[i][0];
			int lev18 = arr[i][1];
			
			
		}
	}

}

package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class p2562_ÃÖ´ñ°ª {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[9];
		int[] sort = new int[9];
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 9; i++) {
			arr[i] = input.nextInt();
			sort[i] = arr[i];
		}
		Arrays.sort(sort);
		int max = sort[8];
		int index = 0;
		for(int i = 0; i < 9; i++) {
			if(arr[i] == max){
				index = i;
				break;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
		input.close();
	}

}

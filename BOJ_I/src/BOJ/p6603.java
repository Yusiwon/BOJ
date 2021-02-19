package BOJ;

import java.util.Scanner;

public class p6603 {

	static int n;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);

		while(true) {
			int n = input.nextInt();
			input.next();
			String[] str = input.nextLine().split(" ");

			System.out.println(str.length);
			for(int i = 0 ; i < n; i++) {
				System.out.print(str[i]+"*");
			}
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}

			do {
				for(int j = 0; j < 5; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println(arr[6]);
			}while(next_permutation());
			
			System.out.println();
		}

	}
	public static boolean next_permutation() {
		if(arr.length == 1)	return false;
		int indexi = arr.length-1;
		for(int i = arr.length-1; i > 0; i--) {
			if(arr[i-1] < arr[i]) {
				indexi = i;
				break;
			}
			if(i==1) return false;
		}


		int indexj = arr.length-1;
		for(int j = arr.length-1; j > 0; j--) {
			if(arr[indexi-1] < arr[j]) {
				indexj = j;
				break;
			}
		}

		int temp = 0;
		temp = arr[indexi-1];
		arr[indexi-1] = arr[indexj];
		arr[indexj] = temp;

		int range = (arr.length - indexi)/2;
		for(int i = 0; i < range; i++){
			temp = arr[indexi];
			arr[indexi++] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return true;
	}

}

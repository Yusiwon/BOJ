package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class p6443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();


		for(int i = 0; i < size; i++) {
			String str = input.nextLine();
			char[] array = new char[str.length()];
			for(int n = 0; n < str.length(); n++) {
				char ch = str.charAt(n);
				array[n] = ch;
			}

			Arrays.sort(array);
			for(int j= 0; j < str.length(); j++) 
				System.out.print(array[j]);

			System.out.println();

			while(next_permutation(array)){
				for(int m = 0; m < str.length(); m++) 
					System.out.print(array[m]);

				System.out.println();
			}
		}
	}

	public static boolean next_permutation(char[] arr) {
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

		char temp = 0;
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

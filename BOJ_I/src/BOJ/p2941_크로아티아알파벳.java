package BOJ;

import java.util.Scanner;

public class p2941_크로아티아알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		

		for(int i = 0; i < arr.length; i++) {
			str = str.replace(arr[i], "c");
		}
		
		System.out.println(str.length());
		input.close();
	}

}

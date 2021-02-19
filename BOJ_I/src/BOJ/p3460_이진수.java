package BOJ;

import java.util.Scanner;

public class p3460_ÀÌÁø¼ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		int test = input.nextInt();
		
		for(int i = 0; i < test; i++) {
			int number = input.nextInt();
			String bi = Integer.toBinaryString(number);
			
			for(int j = bi.length()-1; j >= 0; j--) {
				if(bi.charAt(j) == '1') {
					System.out.print(bi.length()-j-1 + " ");
				}
			}
		}

	}

}

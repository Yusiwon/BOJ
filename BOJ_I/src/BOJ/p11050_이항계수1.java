package 백준;

import java.util.Scanner;

public class p11050_이항계수1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int ren = 1, rek = 1;
		for(int i = 0; i < k; i++) {
			ren *= n-i;	
			rek *= k-i;
		}
		
		System.out.println(ren/rek);
		input.close();
	}

}

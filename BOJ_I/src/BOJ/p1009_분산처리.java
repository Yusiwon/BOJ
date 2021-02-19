package 백준;

import java.util.Scanner;

public class p1009_분산처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input  = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int data = (int)Math.pow(a, b);
			
			if(data > 10) {
				data = data % 10;
			}
			if(data == 0) {
				data = 10;
			}
			
			System.out.println(data);
		}
	}

}

package 백준;

import java.util.Scanner;

public class p2702_초6수학 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		
		for(int s = 0; s < size; s++) {
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			int number = 0;
			
			int max = 1, min =1;
			
			if(n1 >= n2) number = n1;
			else	number = n2;
			
			for(int i = 2; i < number; i++) {
				while(n1 % i == 0 && n2 % i == 0) {
					max = max * i;
					min = min * i;
					n1 = n1 / i;
					n2 = n2 / i;
				}
			}
			
			min  = min * n1 * n2;
			
			System.out.println(min + " " + max);
		}
		input.close();
	}

}

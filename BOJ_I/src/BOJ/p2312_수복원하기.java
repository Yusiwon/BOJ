package BOJ;

import java.util.Scanner;

public class p2312_수복원하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();


		for(int s = 0; s < size; s++) {
			int number = input.nextInt();
			int count = 0;	
			int nnumber = number;
			
			for(int i = 2; i <= nnumber; i++) {

				while(number != 1 && number%i == 0) {
					
						number = number / i;
						count++;
					
				}
				
				if(count > 0) {
					System.out.println(i + " " + count);
				}
				count = 0;
				if(number == 1) {
					break;
				}
			}
			input.nextLine();
		}
		input.close();
	}

}

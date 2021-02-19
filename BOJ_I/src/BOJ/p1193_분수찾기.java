package BOJ;

import java.util.Scanner;

public class p1193_분수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		input.close();
		
		int row = 1; int colum = 1;
		boolean ud = true;
		
		for(int i = 1; i < max; i++) {
			if(ud) {
				row--;
				colum++;
				
				if(row == 0) {
					ud = false;
					row++;
				}
			}
			else {
				row++;
				colum--;
				
				if(colum == 0) {
					ud = true;
					colum++;
				}
			}
		}
		
		System.out.println(row + "/" + colum);
		
	}

}

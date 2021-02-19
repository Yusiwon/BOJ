package πÈ¡ÿ;

import java.util.Scanner;

public class p5586_JOIøÕIOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		int jcount = 0, icount = 0;
		for(int i = 0; i < str.length()-2; i++) {
			if(str.charAt(i) == 'J') {
				if(str.charAt(i+1) == 'O') {
					if(str.charAt(i+2) == 'I') {
						jcount++;
					}
 				}
			}
			if(str.charAt(i) == 'I') {
				if(str.charAt(i+1) == 'O') {
					if(str.charAt(i+2) == 'I') {
						icount++;
					}
 				}
			}
		}
		
		System.out.println(jcount);
		System.out.println(icount);
		input.close();
	}

}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4504_배수찾기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("0")) break;
			
			int ber = Integer.parseInt(str);
			
			if(ber < num) {
				System.out.println(ber + " is NOT a multiple of " + num + ".");
			}
			else {
				if(ber % num == 0) {
					System.out.println(ber + " is a multiple of " + num + ".");
				}
				else {
					System.out.println(ber + " is NOT a multiple of " + num + ".");
				}
			}
		}

	}

}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3028_창영마을 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		boolean[] cup = new boolean[3];
		cup[0] = true;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'A') {
				boolean temp = cup[0];
				cup[0] = cup[1];
				cup[1] = temp;
			}
			else if(ch == 'B' ) {
				boolean temp = cup[1];
				cup[1] = cup[2];
				cup[2] = temp;
			}
			else if(ch == 'C') {
				boolean temp = cup[0];
				cup[0] = cup[2];
				cup[2] = temp;
			}
		}
		
		int index = 0;
		for(int i = 0; i < 3; i++) {
			if(cup[i]) {
				index = i+1;
				break;
			}
		}
		
		System.out.println(index);

	}

}

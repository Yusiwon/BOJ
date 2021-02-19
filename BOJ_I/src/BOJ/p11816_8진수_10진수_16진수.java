package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11816_8진수_10진수_16진수 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int index = 0; int result = 0;
		if(str.charAt(0) == '0') {
			if(str.charAt(1) == 'x') {
				
				str = str.substring(2);

				for(int i = str.length()-1; i >= 0; i--) {
					if(str.charAt(i) <= '9') {
						result += Math.pow(16, index) * (str.charAt(i) - '0');
					}
					else {
						result += Math.pow(16, index) * (str.charAt(i) - 'a' + 10);
					}
					index++;
				}
				System.out.println(result);
			}
			else {
				
				for(int i = str.length()-1; i >= 0; i--) {
					if(str.charAt(i) == '1') {
						result += Math.pow(8, index) * (str.charAt(i) - '0');
					}
					index++;
				}
				System.out.println(result);
			}
		}
		else {
			System.out.println(str);
		}
	}


}

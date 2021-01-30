package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1373_2진수8진수 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		if(str.length() % 3 == 1) {
			str = "00" + str;
		}
		else if(str.length() % 3 == 2) {
			str = "0" + str;
		}

		String result = ""; int n = 0;
		for(int i = 0; i < str.length(); i += 3) {
			n = (str.charAt(i) - '0') * 4
					+ (str.charAt(i+1) - '0') * 2
					+ (str.charAt(i+2) - '0');
			result = result + String.valueOf(n);
		}
		
		System.out.println(result);
	}

}


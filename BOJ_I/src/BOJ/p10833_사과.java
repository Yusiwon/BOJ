package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10833_»ç°ú {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		
		int result = 0;
		for(int i = 0; i < count; i++) {
			String[] str = br.readLine().split(" ");
			result += Integer.parseInt(str[1]) % Integer.parseInt(str[0]);
		}
		System.out.println(result);

	}

}

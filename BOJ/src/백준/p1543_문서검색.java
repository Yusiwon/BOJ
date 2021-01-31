package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1543_문서검색 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String find = br.readLine();
		br.close();
		int count = 0;
		for(int i = 0; i <= str.length()-find.length(); i++) {
			String sample = str.substring(i, i + find.length());
			
			if(find.equals(sample)) {
				count++;
				i += find.length();
				i--;
			}
		}
		
		System.out.println(count);

	}

}

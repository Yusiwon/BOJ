package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1436_영화감독숌 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;
		int index = 666;
		while(count != n) {
			
			index++;
			
			if(String.valueOf(index).contains("666")) {
				count++;
			}
			
		}

		System.out.println(index);
	}

}

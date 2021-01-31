package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10798_세로읽기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Character[][] arr = new Character[5][15];

		for(int i = 0; i < 5; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
			for(int j = str.length(); j < 15; j++) {
				arr[i][j] = '^';
			}
		}

		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] == '^') {
					continue;
				}
				System.out.print(arr[j][i]);
			}
		}

	}

}

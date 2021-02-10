package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9325_얼마 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < test; i++) {
			int total = Integer.parseInt(br.readLine());
			int option = Integer.parseInt(br.readLine());
			
			for(int j = 0 ; j < option; j++) {
				String[] str = br.readLine().split(" ");
				int p = Integer.parseInt(str[0]);
				int q = Integer.parseInt(str[1]);
				
				total += p*q;
			}
			
			System.out.println(total);
		}

	}

}

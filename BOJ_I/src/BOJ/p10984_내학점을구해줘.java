package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10984_내학점을구해줘 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; i++) {
			int sub = Integer.parseInt(br.readLine());
			
			int totalhak = 0; float totalsung = 0;
			
			for(int j = 0 ; j < sub; j++) {
				String[] str = br.readLine().split(" ");
				int hak = Integer.parseInt(str[0]);
				float sung = Float.valueOf(str[1]);
				
				totalhak += hak;
				totalsung += hak*sung;
			}
			System.out.print(totalhak + " ");
			float print = totalsung/(float)totalhak;
			System.out.printf("%.1f", print);
			System.out.println();
		}

	}

}

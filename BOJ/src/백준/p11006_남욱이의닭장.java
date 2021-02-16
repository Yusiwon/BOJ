package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11006_남욱이의닭장 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < n; j++) {
			String[] str = br.readLine().split(" ");
			int leg = Integer.parseInt(str[0]);
			int chi = Integer.parseInt(str[1]);
			
			int tleg = leg - chi;
			int oleg = chi - tleg;
			
			System.out.println(oleg + " " + tleg);
		}

	}

}

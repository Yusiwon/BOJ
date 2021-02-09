package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5086_배수와약수 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] str = br.readLine().split(" ");
			
			if(str[0].equals("0") && str[1].equals("0")) break;
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			if(a > b) {
				if(a % b == 0) {
					System.out.println("multiple");
				}
				else {
					System.out.println("neither");
				}
			}
			else {
				if(b % a == 0) {
					System.out.println("factor");
				}
				else {
					System.out.println("neither");
				}
			}
		}

	}

}

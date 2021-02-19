package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4153_직각삼각형 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str[] = br.readLine().split(" ");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a == 0 && b == 0 && c == 0)	break;
			
			if((a*a)+(b*b) == (c*c)) 
				System.out.println("right");
			else if((a*a)+(c*c) == (b*b)) 
				System.out.println("right");
			else if((b*b)+(c*c) == (a*a)) 
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		
		br.close();
	}

}

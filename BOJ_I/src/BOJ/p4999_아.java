package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4999_¾Æ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String j = br.readLine();
		String d = br.readLine();
		
		if(j.length() >= d.length())
			System.out.println("go");
		else
			System.out.println("no");

	}

}

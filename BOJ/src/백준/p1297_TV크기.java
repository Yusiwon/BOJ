package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1297_TV크기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[]  str = br.readLine().split(" ");
		
		int dia = Integer.parseInt(str[0]);
		int hei = Integer.parseInt(str[1]);
		int wid = Integer.parseInt(str[2]);
		
		double rate = Math.sqrt(Math.pow(dia, 2) / (Math.pow(hei, 2) + Math.pow(wid, 2))) ;
		
		System.out.println((int)Math.floor(hei*rate) + " " + (int)Math.floor(wid*rate));
	}

}

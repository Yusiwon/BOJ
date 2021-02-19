package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5532_¹æÇÐ¼÷Á¦ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		int kor, mat;
		kor = a / c;
		if(a % c != 0)	kor++;
		
		mat = b / d;
		if(b % d != 0)	mat++;
		
		System.out.println(l - Math.max(kor,  mat));

	}

}

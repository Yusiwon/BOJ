package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p1934_최소공배수 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int a, b;
		for(int i = 0; i < t; i++) {
			String[] arr = br.readLine().split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			
			int cdg = cdg(Math.max(a, b), Math.min(a, b));
			System.out.println(csg(a, b, cdg));
		}

	}
	
	public static int cdg(int a, int b) {
		while(b > 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
	
	public static int csg(int a, int b, int cdg) {
		int temp = (a * b) / cdg;
		return temp;
	}

}

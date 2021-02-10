package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p13241_최소공배수 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		long a = Long.valueOf(str[0]);
		long b = Long.valueOf(str[1]);
		
		System.out.println(csg(a, b, cdg(Math.max(a, b), Math.min(a, b))));
	}
	
	public static long cdg(long max, long min) {
		while(min > 0) {
			long temp = max;
			max = min;
			min = temp % min;
		}
		return max;
	}
	
	public static long csg(long max, long min, long cdg) {
		long result = (max * min) / cdg;
		return result;
	}

}

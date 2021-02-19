package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15964_이상한기호 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long first = Integer.parseInt(st.nextToken());
		long second = Integer.parseInt(st.nextToken());
		
		long result =  (first + second)*(first-second);
		
		System.out.println(result);
	}

}

package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15964_이상한기호 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		
		int result =  (first + second)*(first-second);
		
		System.out.println(result);
	}

}

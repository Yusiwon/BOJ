package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p20492_¼¼±Ý {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		System.out.print((int)(number*0.78) + " ");
		
		
		int remain = (int)((number*0.2)*0.22);
		System.out.println(number - remain);
		
	}

}

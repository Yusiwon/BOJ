package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4101_Å©³Ä {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] str = br.readLine().split(" ");
			
			int[] arr =  new int[2];
			arr[0] = Integer.parseInt(str[0]);
			arr[1] = Integer.parseInt(str[1]);
			
			if(arr[0] == 0 && arr[1] == 0)	break;
			
			if(arr[0] <= arr[1]) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
			}
			
		}

	}

}

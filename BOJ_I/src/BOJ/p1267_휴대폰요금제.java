package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1267_휴대폰요금제 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		String[] temp = br.readLine().split(" ");
		int[] arr = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		int y = 0; int m = 0;
		for(int i = 0; i < count; i++) {
			y += arr[i] / 30 + 1;
			m += arr[i] / 60 + 1;
		}
		
		int ym = y * 10; int mm = m * 15;
		if(ym < mm) {
			System.out.println("Y " + ym);
		}
		else if(mm < ym) {
			System.out.println("M " + mm);
		}
		else {
			System.out.println("Y M " + ym);
		}

		
	}

}

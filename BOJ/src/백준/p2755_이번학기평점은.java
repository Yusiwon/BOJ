package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2755_이번학기평점은 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int count = Integer.parseInt(br.readLine());
		
		
		float sum = 0;
		int hsum = 0; int hak = 0; float score = 0;
		for(int i = 0; i < count; i++) {
			String[] arr = br.readLine().split(" ");
			
			hak = Integer.parseInt(arr[1]);
			hsum += hak;
			char alpha = arr[2].charAt(0);
			if(alpha == 'F') {
				continue;
			}
			
			if(alpha == 'A') {
				score += 4.0;
			}
			else if(alpha == 'B') {
				score += 3.0;
			}
			else if(alpha == 'C') {
				score += 2.0;
			}
			else if(alpha == 'D') {
				score += 1.0;
			}
			
			char plma = arr[2].charAt(1);
			if(plma == '+') {
				score += 0.3;
			}
			else if(plma == '-') {
				score -= 0.3;
			}
			
			sum += hak * score;
			score = 0;;
		}
		
		System.out.printf("%.2f", sum/hsum);
		
	}

}

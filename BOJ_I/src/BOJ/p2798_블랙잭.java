package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2798_∫Ì∑¢¿Ë {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int size = Integer.parseInt(str[0]);
		int max = Integer.parseInt(str[1]);
		
		int[] card = new int[size];
		String[] temp = br.readLine().split(" ");
		
		for(int i = 0; i < size; i++) {
			card[i] = Integer.parseInt(temp[i]);
		}
		
		int msum = 0;	int sum = 0;
		for(int i = 0; i < size-2; i++) {
			for(int j = i+1; j < size-1; j++) {
				for(int m = j+1; m < size; m++) {
					sum = card[i] + card[j] + card[m];
					
					if(sum <= max && sum > msum) {
						msum = sum;
					}
				}
			}
		}
		
		System.out.println(msum);

	}

}

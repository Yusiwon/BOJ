package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3036_ธต {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		int base = Integer.parseInt(str[0]);
		
		for(int i = 1; i < n; i++) {
			int cir = Integer.parseInt(str[i]);
			int div = cdg(Math.max(base, cir), Math.min(base,  cir));
			
			System.out.println((base/div) + "/" + (cir/div));
		}

	}
	
	public static int cdg(int max, int min) {
		
		while(min > 0) {
			int temp = max;
			max = min;
			min = temp % min;
		}
		
		return max;
	}

}

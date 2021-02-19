package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1292_쉽게못푸는문제 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int start = Integer.parseInt(str[0]);
		int end = Integer.parseInt(str[1]);

		br.close();
		int arr[] = new int[1001];
		int number = 1;

		for (int i = 1; i <= end; i++) {
			for(int j = 0; j < number; j++) {
				if(i > 1000) 	break;
				arr[i++] = number;
				
			}
			i--;
			number++;
		}

		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}

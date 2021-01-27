package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p10816_숫자카드2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n =Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> map = new HashMap<>();
		String[] temp = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		for(int i = 0; i < n; i++) {
			int number = arr[i];
			if(map.containsKey(number)) {
				int value = map.get(number)+1;
				map.put(number, value);
			}
			else {
				map.put(number, 1);
			}
		}
		
		n = Integer.parseInt(br.readLine());
		String[] tp = br.readLine().split(" ");
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(tp[i]);
		}
		for(int i = 0; i < n; i++) {
			int num = arr1[i];
			if(map.containsKey(num)) {
				System.out.print(map.get(num) + " ");
			}
			else {
				System.out.print(0 + " ");
			}
		}
	}

}


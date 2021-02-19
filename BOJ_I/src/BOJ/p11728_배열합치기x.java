package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class p11728_배열합치기x {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().replace(" ", "");
		int n = str.charAt(0)-'0';
		int m = str.charAt(1)-'0';

		int[] a = new int[n];
		int[] b = new int[m];
		List<Integer> list = new LinkedList<>();
		
		String str1 = br.readLine().replace(" ", "");
		for(int i = 0; i < n; i++) {
			a[i] = str1.charAt(i)-'0';
			
			if(!list.contains(a[i])) {
				list.add(a[i]);
			}
		}
		
		String str2 = br.readLine().replaceAll(" ", "");
		for(int i = 0; i < m; i++) {
			b[i] = str2.charAt(i) - '0';
			
			if(!list.contains(b[i])) {
				list.add(b[i]);
			}
		}

		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}

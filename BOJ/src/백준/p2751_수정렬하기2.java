package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p2751_수정렬하기2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < size; i++) {
			int n = Integer.parseInt(br.readLine());
			list.add(n);
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < size; i++) {
			sb.append(list.get(i));
			sb.append('\n');
		}
		
		System.out.println(sb.toString());
	}

}

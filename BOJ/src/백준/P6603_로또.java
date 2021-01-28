package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6603_로또 {

	static int size;
	static boolean[] visit;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String[] str = br.readLine().split(" ");

			if(str[0].equals("0")) 	break;

			size = Integer.parseInt(str[0]);
			arr = new int[size];
			visit = new boolean[size];

			for(int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(str[i+1]);
			}

			lotto(0, 0);
		}
	}
	
	
	public static void lotto(int start, int depth) {

		if(depth == 6) {
			for(int i = 0; i < size; i++) {
				if(visit[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		for(int i = start; i < size; i++) {
			visit[i] = true;
			lotto(i+1, depth+1);
			visit[i] = false;
		}
	}
}

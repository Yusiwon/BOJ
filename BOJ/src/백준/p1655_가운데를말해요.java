package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class p1655_가운데를말해요 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = 0; int size = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		while(true) {
			number = Integer.parseInt(br.readLine());
			q.offer(number);
			
			size = q.size();
			if(size % 2 == 0) {
				int index = size % 2 - 1;
				System.out.println(q.peek());
			}
			else {
				int mid = size % 2;
			}
		}
	}

}

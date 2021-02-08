package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p2164_카드2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int card = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= card; i++) {
			q.add(i);
		}
		
		while(q.size() > 1) {
			q.poll();
			q.add(q.poll());
		}
		
		System.out.println(q.poll());
	}

}

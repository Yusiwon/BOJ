package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15702_중간고사채점 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		int std = Integer.parseInt(str[1]);
		
		int[] score = new int[q];
		String[] scorearr = br.readLine().split(" ");
		for(int i = 0; i < q; i++) {
			score[i] = Integer.parseInt(scorearr[i]);
		}
		
		int[] student = new int[100001];
		
		for(int i = 0; i < std; i++) {
			String[] infor = br.readLine().split(" ");
			int stdnumber = Integer.parseInt(infor[0]);
			
			int sum = 0;
			for(int j = 1; j <= q; j++) {
				if(infor[j].equals("O")) {
					sum += score[j-1];
				}
			}
			
			student[stdnumber] = sum;
		}
		
		int maxindex = 0; int maxscore = 0;
		
		for(int i = 1; i < 100001; i++) {
			if(student[i] > maxscore) {
				maxindex = i;
				maxscore = student[i];
			}
		}
		
		System.out.println(maxindex + " " + maxscore);

	}

}

package 백준;

import java.util.*;

public class p14888_연산자끼워넣기 {

	static int N;
	static int[] number;
	static int[] op = new int[4];
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;




	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		number = new int[N+1];
		for(int i=0;i<N;i++){
			number[i] = sc.nextInt();
		}
		for(int i=0;i<4;i++){
			op[i] = sc.nextInt();
		}
		dfs(0,number[0],0);
		System.out.println(max);
		System.out.println(min);


	}

	public static void dfs(int num, int result,int j){
		if(num == N-1){
			if(max<result)
				max = result;
			if(min>result)
				min = result;
		}

		for(int i=0;i<4;i++){
			if(op[i]>0){
				if(i==0){
					op[i]--;
					dfs(num+1,result + number[j+1],j+1);
					op[i]++;
				}
				else if(i==1){
					op[i]--;
					dfs(num+1,result - number[j+1],j+1);
					op[i]++;
				}
				else if(i==2){
					op[i]--;
					dfs(num+1,result * number[j+1],j+1);
					op[i]++;
				}
				else if(i==3){
					op[i]--;
					dfs(num+1,result / number[j+1],j+1);
					op[i]++;
				}
			}
		}
	}
}




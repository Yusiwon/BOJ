package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1929_�Ҽ����ϱ� {
	public static boolean[] prime;
	public static int start;
	public static int end;
	public static void main(String[] args) throws IOException{
		// �����佺�׳׽��� ü

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		start = Integer.parseInt(str[0]);
		end = Integer.parseInt(str[1]);
		
		prime = new boolean[end+1];
		prime[0] = true;	// �Ҽ� = false
		prime[1] = true;
		
		�����佺�׳׽���ü();
		
		for(int i = start; i <= end; i++) {
			if(!prime[i])	System.out.println(i);
		}
	}
	
	public static void �����佺�׳׽���ü() { // �Ҽ����ϴ� �˰����̸�
		for(int i = 2; i*i <= end; i++) {
			if(!prime[i]) { // prime[i]�� �Ҽ��϶�
				for(int j = i*i; j <= end; j += i) {
					prime[j] = true;
				}
			}
		}
	}

}

package ����;

import java.util.Scanner;

public class p1316_�׷�ܾ�üĿ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		int a = Integer.parseInt(sc.nextLine()); 
		int[] st = new int[100]; 
		int tg = 0; 
		int cnt=0; //�׷� �ܾ��� ������ ã�� ���� 
		for(int i =0; i<a; i++) { 
			String b = sc.nextLine(); 

			for(int j=0; j<b.length(); j++) { 
				st[j]= b.charAt(j); 

			} 
			for(int j=0; j<b.length(); j++) {  
				for(int x=j+2; x<b.length(); x++) { //2ĭ ����� �ִ� �ܾ���� ã������ ����x 
					if(st[j]==st[x-1]) { //�̿��� ���� ���� ���� �� �߿��� ã�ƾ� �ϱ⶧���� �� 

					}else { 
						if(st[j]==st[x]) { //���� �� ã���� tg=1 
							tg=1; 
						} 
					} 
				} 
			} 
			if(tg==0) { 
				cnt++; 
			} 
			tg=0; 
		} 
		System.out.println(cnt); 


	}

}

package ����;

import java.util.Scanner;

public class p2609_�ִ��������ּҰ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		long n1 = input.nextInt();
		long n2 = input.nextInt();

		long cdg = cdg(Math.max(n1, n2), Math.min(n1, n2));
		System.out.println(cdg);
		
		long csg = csg(n1, n2, cdg);
		System.out.println(csg);
		
	}
	
	public static long cdg(long a, long b) {
		while(b > 0) {
			long temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
	
	public static long csg(long a, long b, long cdg) {
		long result = (a * b) / cdg;
		return result;
	}

}

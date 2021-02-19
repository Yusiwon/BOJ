package BOJ;

import java.util.Scanner;

public class p5026_박사과정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		for(int i = 0; i < size; i++) {
			String str = input.nextLine();
			
			if(str.equals("P=NP")) {
				System.out.println("skipped");
			}
			else {
				StringBuilder sb = new StringBuilder();
				int[] arr = new int[2];
				int index = 0;
				for(int j = 0; j < str.length(); j++) {
					char ch = str.charAt(j);
					
					if(ch == '+') {
						arr[index] = Integer.parseInt(sb.toString());
						sb.delete(0, sb.length());
						index++;
					}
					else {
						sb.append(ch);
					}
				}
				arr[index] = Integer.parseInt(sb.toString());
				int a = arr[0];
				int b = arr[1];
				int sum = a+b;
				System.out.println(sum);
				
			}
		}
		input.close();
	}

}

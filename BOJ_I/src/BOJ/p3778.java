package BOJ;

import java.util.Scanner;

public class p3778 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		String str1 = input.nextLine();
		String str2 = input.nextLine();

		String[] arr1 = str1.split("");
		String[] arr2 = str2.split("");


		int delete = 0;
		for(int i = 0; i < str1.length(); i++) {
			for(int j = 0; j < str2.length(); j++) {

				if(arr1[i].equals(arr2[j])) {
					++delete;
					arr1[i] = "";
					arr2[j] = "";
					break;
				}		
			}
		}

		int sum = arr1.length + arr2.length - (2*delete);
		System.out.println(sum);

		input.close();
	}
}



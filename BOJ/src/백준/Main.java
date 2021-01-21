package น้มุ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String count = input.nextLine();
		input.nextLine();
		for(int i = 0; i < Integer.parseInt(count); i++){
			ArrayList<String> arrayList = new ArrayList<>();
			ArrayList<String> resultList = new ArrayList<>();
			int[] time = new int[24];
			for(int j = 0; j < time.length; j++){
				time[j] = input.nextInt();
			}
			input.nextLine();

			while(input.hasNextLine()){
				String s;

				s = input.nextLine();
				if(s.equals("")){
					break;
				}else{
					arrayList.add(s);
				}
			}
			Collections.sort(arrayList);
			String[] test1,test2;
			int o =0;
			while(o < arrayList.size()-1) {
				test1 = arrayList.get(o).split(" ");
				test2 = arrayList.get(o+1).split(" ");
				if(test1[0].equals(test2[0]) && test1[2] != test2[2] && 
						test1[1].substring(3,5).equals(test2[1].substring(3,5))){
					resultList.add(arrayList.get(o));
					resultList.add(arrayList.get(o+1));
					o += 2;
				}else {
					o += 1;
				}
			}

			int start_time = 0;
			int km = 0;
			float price = 0;
			boolean print = false;
			Collections.sort(resultList);

			for(int k = 0; k < resultList.size(); k+=2){
				test1 = resultList.get(k).split(" ");
				test2 = resultList.get(k+1).split(" ");
				String[] check = null;
				km= Math.abs(Integer.parseInt(test1[3]) - Integer.parseInt(test2[3]));

				if(k==0){
					start_time = Integer.parseInt(test1[1].substring(6,8));
					price += km*time[start_time]+100;
				}else if(k!=0){
					check = resultList.get(k-2).split(" ");
					if(check[0].equals(test1[0])){
						start_time = Integer.parseInt(test1[1].substring(6,8));
						price += km*time[start_time]+100;
					}else{
						print = true;
					}
				}
				if(print == true){
					price += 200;
					System.out.printf("%s $%.2f", check[0], price/100);
					System.out.println();

					start_time = Integer.parseInt(test1[1].substring(6,8));
					price = km*time[start_time]+100;
					print = false;
				}
				if(k == resultList.size()-2){
					price += 200;
					System.out.printf("%s $%.2f", test1[0], price/100);
					System.out.println();
				}
			}
			System.out.println();
		}
		input.close();
	}
}
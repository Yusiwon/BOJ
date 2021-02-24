package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class p11441_합구하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < test; i++) {
			String[] temp = br.readLine().split(" ");
			int start = Integer.parseInt(temp[0]);
			int end = Integer.parseInt(temp[1]);

			int sum = 0;
			for (int j = start; j <= end; j++) {
				sum += arr[j-1];
			}

			sb.append(sum).append('\n');
		}

		System.out.println(sb.toString());

	}

}

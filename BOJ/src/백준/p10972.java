package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10972 {
	static int n;
	static int[] arr;

	/**
	 * 다음 순열을 구하는 메소드.
	 * @return 다음 순열을 구했을 경우 true,
	 * 		다음 순열이 존재하지 않을 경우 false
	 */
	public static boolean next_permutation() {
		if(arr.length == 1)	return false;
		int indexi = arr.length-1;
		for(int i = arr.length-1; i > 0; i--) {
			if(arr[i-1] < arr[i]) {
				indexi = i;
				break;
			}
			if(i==1) return false;
		}


		int indexj = arr.length-1;
		for(int j = arr.length-1; j > 0; j--) {
			if(arr[indexi-1] < arr[j]) {
				indexj = j;
				break;
			}
		}

		int temp = 0;
		temp = arr[indexi-1];
		arr[indexi-1] = arr[indexj];
		arr[indexj] = temp;

		int range = (arr.length - indexi)/2;
		for(int i = 0; i < range; i++){
			temp = arr[indexi];
			arr[indexi++] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		if (next_permutation()) {
			StringBuilder ans = new StringBuilder();
			for (int i = 0; i < n; i++) {
				ans.append(arr[i]).append(' ');
			}
			ans.setCharAt(ans.length() - 1, '\n');
			System.out.print(ans);
		} else {
			System.out.println(-1);
		}

		br.close();
	}
}
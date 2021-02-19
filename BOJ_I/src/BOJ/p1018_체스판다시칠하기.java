package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1018_체스판다시칠하기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int row = Integer.parseInt(str[0]);
		int colum = Integer.parseInt(str[1]);

		boolean[][] bool = new boolean[row][colum];

		for(int i = 0; i < row; i++) {
			String line = br.readLine();

			for(int j = 0; j < colum; j++) {
				char ch = line.charAt(j);

				if(ch == 'W') {
					bool[i][j] = true;
				}
				else if(ch == 'B') {
					bool[i][j] = false;
				}
			}
		}

		int min = 10000;
		for(int n = 0; n < row-7; n++) {
			for(int m = 0; m < colum-7; m++) {

				int w = 0; int b = 0;
				boolean wb = true; boolean bb = false;
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8; j++) {
						if(bool[n+i][m+j] == wb) {
							b++;
						}
						else if(bool[n+i][m+j] == bb){
							w++;
						}
						if(j != 7) {
							wb = !wb;
							bb = !bb;
						}

					}
				}

				if(min > w) {
					min = w;
				}
				if(min > b) {
					min = b;
				}
			}
		}

		System.out.println(min);

	}

}

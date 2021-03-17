package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1996_Áö·ÚÃ£±â {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        char[][] arr = new char[size][size];
        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            for (int j = 0; j < size; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int[][] temp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char ch = arr[i][j];
                int num = (int) (ch - '0');

                if (ch != '.') {
                    temp[i][j] = -1;

                    if (i == 0 && j == 0) {
                        temp[i + 1][j] += num;
                        temp[i][j + 1] += num;
                        temp[i + 1][j + 1] += num;
                    } else if (i == 0 && j == size - 1) {
                        temp[i][j - 1] += num;
                        temp[i + 1][j - 1] += num;
                        temp[i + 1][j] += num;
                    } else if (i == size - 1 && j == 0) {
                        temp[i - 1][j] += num;
                        temp[i - 1][j + 1] += num;
                        temp[i][j + 1] += num;
                    } else if (i == size - 1 && j == size - 1) {
                        temp[i - 1][j] += num;
                        temp[i - 1][j - 1] += num;
                        temp[i][j - 1] += num;
                    } else if (i == 0) {
                        temp[i][j - 1] += num;
                        temp[i + 1][j - 1] += num;
                        temp[i + 1][j] += num;
                        temp[i + 1][j + 1] += num;
                        temp[i][j + 1] += num;
                    } else if (j == 0) {
                        temp[i - 1][j] += num;
                        temp[i - 1][j + 1] += num;
                        temp[i][j + 1] += num;
                        temp[i + 1][j + 1] += num;
                        temp[i + 1][j] += num;
                    } else if (i == size - 1) {
                        temp[i][j - 1] += num;
                        temp[i - 1][j - 1] += num;
                        temp[i - 1][j] += num;
                        temp[i - 1][j + 1] += num;
                        temp[i][j + 1] += num;
                    } else if (j == size - 1) {
                        temp[i - 1][j] += num;
                        temp[i][j - 1] += num;
                        temp[i][j - 1] += num;
                        temp[i + 1][j - 1] += num;
                        temp[i + 1][j] += num;
                    } else {
                        temp[i - 1][j - 1] += num;
                        temp[i-1][j] += num;
                        temp[i - 1][j + 1] += num;
                        temp[i][j - 1] += num;
                        temp[i][j + 1] += num;
                        temp[i + 1][j - 1] += num;
                        temp[i + 1][j] += num;
                        temp[i + 1][j + 1] += num;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int number = temp[i][j];

                if (number == -1) {
                    sb.append("*");
                } else if (number >= 10) {
                    sb.append("M");
                } else {
                    sb.append(number);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}

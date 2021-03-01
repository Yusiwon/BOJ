package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p16935_배열돌리기3 {

    static int row, col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        row = Integer.parseInt(str[0]);
        col = Integer.parseInt(str[1]);
        int r = Integer.parseInt(str[2]);

        String[][] arr = new String[row][col];

        for (int i = 0; i < row; i++) {
            String[] tp = br.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = tp[j];
            }
        }

        String[] oper = br.readLine().split(" ");
        String[][] print = arr;
        for (int i = 0; i < r; i++) {
            switch (oper[i]) {
                case "1" : print = one(print); break;
                case "2" : print = two(print); break;
                case "3" : print = three(print); break;
                case "4" : print = four(print); break;
                case "5" : print = five(print); break;
                case "6" : print = six(print); break;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(print[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] one(String[][] arr) {

        String[][] temp = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = arr[row - i - 1][j];
            }
        }

        return temp;
    }

    public static String[][] two(String[][] arr) {

        String[][] temp = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = arr[i][col - j - 1];
            }
        }

        return temp;
    }

    public static String[][] three(String[][] arr) {

        String[][] temp = new String[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[j][row - i - 1] = arr[i][j];
            }
        }

        int tm = row;
        row = col;
        col = tm;

        return temp;
    }

    public static String[][] four(String[][] arr) {

        String[][] temp = new String[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[col - j - 1][i] = arr[i][j];
            }
        }

        int tm = row;
        row = col;
        col = tm;

        return temp;
    }

    public static String[][] five(String[][] arr) {

        String[][] temp = new String[row][col];

        int midX = row / 2;
        int midY = col / 2;

        for (int i = 0; i < midX; i++) {
            for (int j = 0; j < midY; j++) {
                temp[i][midY + j] = arr[i][j];
            }
        }

        for (int i = 0; i < midX; i++) {
            for (int j = midY; j < col; j++) {
                temp[midX + i][j] = arr[i][j];
            }
        }

        for (int i = midX; i < row; i++) {
            for (int j = midY; j < col; j++) {
                temp[i][j - midY] = arr[i][j];
            }
        }

        for (int i = midX; i < row; i++) {
            for (int j = 0; j < midY; j++) {
                temp[i - midX][j] = arr[i][j];
            }
        }

        return temp;
    }

    public static String[][] six(String[][] arr) {

        String[][] temp = new String[row][col];

        int midX = row / 2;
        int midY = col / 2;

        for(int i = 0; i < midX; i++) {
            for(int j = 0; j < midY; j++) {
                temp[i + midX][j] = arr[i][j];
            }
        }

        for(int i = midX; i < row; i++) {
            for(int j = 0; j < midY; j++) {
                temp[i][j + midY] = arr[i][j];
            }
        }

        for(int i = midX; i < row; i++) {
            for(int j = midY; j < col; j++) {
                temp[i - midX][j] = arr[i][j];
            }
        }

        for(int i = 0; i < midX; i++) {
            for(int j = midY; j < col; j++) {
                temp[i][j - midY] = arr[i][j];
            }
        }

        return temp;
    }
}

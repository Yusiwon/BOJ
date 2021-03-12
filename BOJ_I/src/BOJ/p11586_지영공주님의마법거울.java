package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11586_지영공주님의마법거울 {

    static char[][] arr;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());

        arr = new char[size][size];

        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            for (int j = 0; j < size; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        String angry = br.readLine();
        if (angry.equals("1")) {
            print(arr);
        } else if (angry.equals("2")) {
            two();
        } else if (angry.equals("3")) {
            three();
        }
    }

    public static void two() {
        char[][] temp = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = arr[i][size-j-1];
            }
        }

        print(temp);
    }

    public static void three() {
        char[][] temp = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = arr[size-i-1][j];
            }
        }

        print(temp);
    }

    public static void print(char[][] arr) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

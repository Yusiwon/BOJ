package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 누울자리를찾아라 {

    static char[][] arr;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        System.out.print(horizontal() + " ");
        System.out.println(vertical());
    }

    // 가로 count
    public static int horizontal() {
        int hor = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '.') {
                    count++;
                } else {
                    if (count > 1) {
                        hor++;
                    }
                    count = 0;
                }
            }
            if (count > 1) {
                hor++;
            }
        }
        return hor;
    }

    // 세로 count
    public static int vertical() {
        int ver = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == '.') {
                    count++;
                } else {
                    if (count > 1) {
                        ver++;
                    }
                    count = 0;
                }
            }
            if (count > 1) {
                ver++;
            }
        }
        return ver;
    }
}

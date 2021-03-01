package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p2210_숫자판점프 {

    static String[][] arr = new String[5][5];
    static Set<String> set = new HashSet<>();
    static int[] goX = {-1, 1, 0, 0};
    static int[] goY = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            String[] temp = br.readLine().split(" ");
            for(int j = 0; j < 5; j++) {
                arr[i][j] = temp[j];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                go(1, i, j, arr[i][j]);
            }
        }

        System.out.println(set.size());
    }

    public static void go(int count, int x, int y, String num) {
        if(count == 6) {
            set.add(num);
            return;
        }
        for(int i = 0; i < 4; i++) {
            int mx = x + goX[i];
            int my = y + goY[i];

            if (mx >= 0 && mx < 5 && my >= 0 && my < 5) {
                go(count + 1, mx, my, num + arr[mx][my]);
            }
        }
    }
}

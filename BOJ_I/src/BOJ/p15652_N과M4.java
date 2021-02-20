package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15652_N°úM4 {

    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int size = Integer.parseInt(str[1]);

        arr = new int[size];

        dfs(n, size, 0, -1);

        System.out.println(sb.toString());
    }

    public static void dfs(int n, int size, int depth, int prev) {
        if (depth == size) {
            for (int i = 0; i < size; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < n; i++) {
            if (i >= prev) {
                arr[depth] = i+1;
                dfs(n, size, depth+1, i);
            }
        }
    }
}

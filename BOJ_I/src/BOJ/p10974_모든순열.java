package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10974_모든순열 {

    static int[] output;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] visit = new boolean[n];
        int[] arr = new int[n];
        output = new int[n];
        int depth = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        go(n,0, arr, visit);
        System.out.println(sb.toString());
    }

    public static void go(int n, int depth, int[] arr, boolean[] visit) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                output[depth] = arr[i];
                go(n,depth+1, arr, visit);
                visit[i] = false;
            }
        }
    }
}

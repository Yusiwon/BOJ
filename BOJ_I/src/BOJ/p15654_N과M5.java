package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p15654_N��M5 {

    static int[] arr;
    static int[] temp;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int size = Integer.parseInt(str[1]);

        arr = new int[size];
        visit = new boolean[n];

        temp = new int[n];
        String[] tp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            temp[i] = Integer.parseInt(tp[i]);
        }

        Arrays.sort(temp);
        dfs(n, size, 0);

        System.out.println(sb.toString());
    }

    public static void dfs(int n, int size, int depth) {
        if (depth == size) {
            for (int i = 0; i < size; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = temp[i];
                dfs(n, size, depth+1);
                visit[i] = false;
            }
        }
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15649_N°úM1 {

    static int[] arr;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int size = Integer.parseInt(str[1]);

        arr = new int[size];
        visit = new boolean[n];

        dfs(n, size, 0);
    }

    public static void dfs(int n, int size, int depth) {

        if(depth == size) {
            for(int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i+1;
                dfs(n, size, depth+1);
                visit[i] = false;
            }
        }
    }
}

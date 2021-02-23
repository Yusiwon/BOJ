package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p15664_N°úM10 {

    static int[] arr;
    static int[] temp;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int size = Integer.parseInt(str[1]);

        arr = new int[size];
        temp = new int[n];
        visit = new boolean[n];

        String[] tp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            temp[i] = Integer.parseInt(tp[i]);
        }

        Arrays.sort(temp);
        dfs(n, size, 0, -1);

        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void dfs(int n, int size, int depth, int pre) {
        if (depth == size) {
            for (int i = 0; i < size; i++) {
                sb.append(arr[i]).append(" ");
            }
            if(!list.contains(sb.toString())) {
                list.add(sb.toString());
            }
            sb.delete(0, sb.length());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (pre == -1 || temp[i] >= pre) {
                if (!visit[i]) {
                    visit[i] = true;
                    arr[depth] = temp[i];
                    dfs(n, size, depth + 1, temp[i]);
                    visit[i] = false;
                }
            }
        }
    }
}

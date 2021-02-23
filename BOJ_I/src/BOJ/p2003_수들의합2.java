package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2003_수들의합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[] arr = new int[n];
        String[] narr = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(narr[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int index = i;

            while (sum < m && index < n) {
                sum += arr[index];
                index++;
            }

            if (sum == m) {
                count++;
            }
        }

        System.out.println(count);

    }
}

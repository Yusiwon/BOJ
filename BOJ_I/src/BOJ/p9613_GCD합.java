package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9613_GCDÇÕ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int k = 0; k < n; k++) {
            String[] str = br.readLine().split(" ");
            int size = Integer.parseInt(str[0]);

            long sum = 0;

            for (int i = 1; i <= size; i++) {
                for (int j = i + 1; j <= size; j++) {
                    long a = Long.parseLong(str[i]);
                    long b = Long.parseLong(str[j]);
                    sum += GCD(Math.max(a, b), Math.min(a, b));
                }
            }

            System.out.println(sum);
        }

    }

    public static long GCD(long max, long min) {
        while (min > 0) {
            long temp = max;
            max = min;
            min = temp % min;
        }

        return max;
    }
}

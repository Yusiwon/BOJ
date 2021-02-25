package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14495_피보나치비스무리한수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] fibo = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                if (i >= 1 && i <= 3) {
                    fibo[i] = 1;
                }else{
                    fibo[i] = fibo[i - 1] + fibo[i - 3];
                }

            }



        System.out.println(fibo[n]);
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ½´ÆÛ¸¶¸®¿À {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int preSum = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            sum += n;

            if (sum >= 100) {
                break;
            } else {
                preSum = sum;
            }
        }

        if ((100 - preSum) < (sum - 100)) {
            System.out.println(preSum);
        } else {
            System.out.println(sum);
        }
    }
}

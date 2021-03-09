package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1463_1로만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());

        int count = 0;
        if(num != 0) {
            if ((num % 3) != 0 && (num & 2) != 0) {
                num--;
                count++;
            }

            while ((num & 3) == 0 && num != 1) {
                num /= 3;
                count++;
            }

            while ((num & 2) == 0 && num != 1) {
                num /= 2;
                count++;
            }
        }


        System.out.println(count);
    }
}

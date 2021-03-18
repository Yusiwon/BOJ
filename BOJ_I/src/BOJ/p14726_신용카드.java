package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14726_신용카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String str = br.readLine();

            int result = 0;
            for (int j = 0; j < str.length(); j++) {
                int  num = str.charAt(j) - '0';

                if (j % 2 == 0) {
                    num *= 2;
                    if (num > 9) {
                        result += num / 10 + num % 10;
                    } else {
                        result += num;
                    }
                } else {
                    result += num;
                }
            }

            if ((result % 10) == 0) {
                System.out.println("T");
            } else {
                System.out.println("F");
            }
        }
    }
}

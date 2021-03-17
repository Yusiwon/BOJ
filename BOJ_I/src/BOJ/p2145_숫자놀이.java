package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2145_¼ýÀÚ³îÀÌ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) break;

            int result = 0;
            while (true) {
                result += num % 10;
                num /= 10;

                if (num < 10) {
                    result += num;
                    if (result > 9) {
                        num = result;
                        result = 0;
                    } else {
                        break;
                    }
                }

            }
            System.out.println(result);

        }
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9507_GenerationsOfTribbles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        long[] koong = new long[68];
        koong[0] = 1;
        koong[1] = 1;
        koong[2] = 2;
        koong[3] = 4;

        int index = 4;

        while (index < 68) {
            koong[index] =
                    koong[index - 1] + koong[index - 2] + koong[index - 3] + koong[index - 4];
            index++;
        }

        for (int i = 0; i < test; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(koong[num]);
        }


    }
}

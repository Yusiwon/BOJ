package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11047_µ¿Àü0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int size = Integer.parseInt(str[0]);
        int want = Integer.parseInt(str[1]);

        int[] coin = new int[size];

        for (int i = 0; i < size; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i = size-1; i > -1; i--) {
            if (coin[i] <= want) {
                count += (want / coin[i]);
                want = want % coin[i];
            }
        }

        System.out.println(count);
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1735_ºÐ¼öÇÕ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");

        int as = Integer.parseInt(a[0]);
        int am = Integer.parseInt(a[1]);
        int bs = Integer.parseInt(b[0]);
        int bm = Integer.parseInt(b[1]);

        as = (as * bm) + (bs * am);
        am = am * bm;

        int gcd = GCD(Math.max(as, am), Math.min(as, am));

        System.out.println(as/gcd + " " + am/gcd);
    }

    public static int GCD(int max, int min) {
        while (min > 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return max;
    }
}

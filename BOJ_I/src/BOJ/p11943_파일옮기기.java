package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11943_파일옮기기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] fir = br.readLine().split(" ");
        String[] sec = br.readLine().split(" ");

        int firApple = Integer.parseInt(fir[0]);
        int firOrange = Integer.parseInt(fir[1]);

        int secApple = Integer.parseInt(sec[0]);
        int secOrange = Integer.parseInt(sec[1]);

        System.out.println(Math.min(firApple + secOrange, firOrange + secApple));
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p20254_SiteScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int Ur = Integer.parseInt(str[0]);
        int Tr = Integer.parseInt(str[1]);
        int Uo = Integer.parseInt(str[2]);
        int To = Integer.parseInt(str[3]);

        System.out.println(56*Ur + 24*Tr + 14*Uo + 6*To);
    }
}

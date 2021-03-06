package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17256_달달함이넘쳐흘러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] atemp = br.readLine().split(" ");
        String[] ctemp = br.readLine().split(" ");

        System.out.print(Integer.parseInt(ctemp[0]) - Integer.parseInt(atemp[2]));
        System.out.print(" ");
        System.out.print(Integer.parseInt(ctemp[1]) / Integer.parseInt(atemp[1]));
        System.out.print(" ");
        System.out.print(Integer.parseInt(ctemp[2]) - Integer.parseInt(atemp[0]));
    }
}

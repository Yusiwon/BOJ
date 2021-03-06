package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p11382_²¿¸¶Á¤¹Î {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        BigInteger a = new BigInteger(str[0]);
        BigInteger b = new BigInteger(str[1]);
        BigInteger c = new BigInteger(str[2]);

        System.out.println(a.add(b).add(c));
    }
}

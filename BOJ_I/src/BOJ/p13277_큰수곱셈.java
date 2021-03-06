package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InaccessibleObjectException;
import java.math.BigInteger;

public class p13277_Å«¼ö°ö¼À {
    public static void main(String[] args) throws InaccessibleObjectException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        BigInteger a = new BigInteger(str[0]);
        BigInteger b = new BigInteger(str[1]);

        System.out.println(a.multiply(b));
    }
}

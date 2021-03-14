package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1439_µÚÁý±â {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int zerocnt = 0; int onecnt = 0;
        boolean zero = str.charAt(0)=='0'? true:false;

        for (int i = 1; i < str.length(); i++) {
            char pre = str.charAt(i - 1);
            char now = str.charAt(i);

            if (zero) {
                if (pre != now) {
                    zerocnt++;
                    zero = false;
                }
            } else {
                if (pre != now) {
                    onecnt++;
                    zero = true;
                }
            }
        }

        if (str.charAt(str.length() - 1) == '0') {
            zerocnt++;
        } else {
            onecnt++;
        }

        System.out.println(Math.min(zerocnt, onecnt));
    }
}

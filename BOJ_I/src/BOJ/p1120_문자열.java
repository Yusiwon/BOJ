package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1120_¹®ÀÚ¿­ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] str = new String[2];
        str[0] = st.nextToken();
        str[1] = st.nextToken();

        int max = 1000;
        for (int i = 0; i <= str[1].length() - str[0].length(); i++) {
            int count = 0;
            for (int j = 0; j < str[0].length(); j++) {
                char achar = str[0].charAt(j);
                char bchar = str[1].charAt(j+i);

                if (achar != bchar) {
                    count++;
                }
            }
            max = Math.min(max, count);
        }

        System.out.println(max);
    }
}

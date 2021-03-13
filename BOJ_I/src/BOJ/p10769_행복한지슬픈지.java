package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10769_행복한지슬픈지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int happy = 0; int sad = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ':') {
                if (str.charAt(++i) == '-') {
                    if (str.charAt(++i) == '(') {
                        sad++;
                    } else if (str.charAt(i) == ')') {
                        happy++;
                    }
                }
            }

        }

        if (happy == 0 && sad == 0) {
            System.out.println("none");
        } else if (happy == sad) {
            System.out.println("unsure");
        } else if (happy > sad) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}

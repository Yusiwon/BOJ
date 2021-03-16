package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2083_럭비클럽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (name.equals("#")) {
                break;
            }
            int age = Integer.parseInt(st.nextToken());
            int kg = Integer.parseInt(st.nextToken());

            if (age > 17 || kg >= 80) {
                System.out.print(name);
                System.out.println(" Senior");
            } else {
                System.out.print(name);
                System.out.println(" Junior");
            }
        }
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10768_특별한날 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        day += month * 100;

        if (day < 218) {
            System.out.println("Before");
        } else if (day > 218) {
            System.out.println("After");
        } else {
            System.out.println("Special");
        }
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p14425_문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int s = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < s; i++) {
            list.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String temp = br.readLine();

            if (list.contains(temp)) {
                count++;
            }
        }

        System.out.println(count);
    }
}

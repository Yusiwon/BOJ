package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14652_나는행복합니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int k = Integer.parseInt(str[2]);

       loop :for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(k == 0) {
                    System.out.println(i + " " + j);
                    break loop;
                }
                k--;
            }
        }
    }
}

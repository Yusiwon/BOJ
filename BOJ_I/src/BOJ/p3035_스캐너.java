package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3035_½ºÄ³³Ê {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        int row = Integer.parseInt(st[0]);
        int col = Integer.parseInt(st[1]);
        int zrow = Integer.parseInt(st[2]);
        int zcol = Integer.parseInt(st[3]);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < row; i++) {
            String str = br.readLine();
            for (int j = 0; j < col; j++) {
                char ch = str.charAt(j);

                for (int zj = 0; zj < zcol; zj++) {
                    sb.append(ch);
                }
            }
            for (int zi = 0; zi < zrow; zi++) {
                System.out.println(sb.toString());
            }
            sb.delete(0, sb.length());
        }
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1384_¸Þ½ÃÁö {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int group = 1;
        while (true) {
            int size = Integer.parseInt(st.nextToken());

            if (size == 0) {
                break;
            }

            String[][] mess = new String[size][size];

            for (int i = 0; i < size; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < size; j++) {
                    mess[i][j] = st.nextToken();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Group ").append(group).append('\n');

            boolean print = false;
            for (int i = 0; i < size; i++) {
                for (int j = 1; j < size; j++) {

                    if (mess[i][j].equals("N")) {
                        int index = i - j >= 0 ? i - j : size + (i - j);
                        sb.append(mess[index][0]).append(" was nasty about ").append(mess[i][0]).append('\n');
                        print = true;
                    }
                }
            }

            if (!print) {
                sb.append("Nobody was nasty").append('\n');
            }
            st = new StringTokenizer(br.readLine());
            group++;
            System.out.println(sb.toString());
        }

    }
}

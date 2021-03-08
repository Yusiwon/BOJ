package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10707_������� {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int xcost = Integer.parseInt(br.readLine());
        int ybase = Integer.parseInt(br.readLine());
        int ylimit = Integer.parseInt(br.readLine());
        int yaddcost = Integer.parseInt(br.readLine());
        int useMonth = Integer.parseInt(br.readLine());

        int x = useMonth * xcost;
        int y = 0;

        if (useMonth > ylimit) {
            y = ybase + (useMonth - ylimit) * yaddcost;
        } else {
            y = ybase;
        }

        System.out.println(Math.min(x, y));

    }
}

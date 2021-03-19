package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5575_타임카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 3; i++) {
            String[] a = br.readLine().split(" ");
            int shour = Integer.parseInt(a[0]);
            int smin = Integer.parseInt(a[1]);
            int ssec = Integer.parseInt(a[2]);
            int ehour = Integer.parseInt(a[3]) - shour;
            int emin = Integer.parseInt(a[4]) - smin;
            int esec = Integer.parseInt(a[5]) - ssec;

            if (esec < 0) {
                esec += 60;
                emin--;
            }
            if (emin < 0) {
                emin += 60;
                ehour--;
            }

            System.out.println(ehour +" "+ emin +" "+ esec);
        }
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class p14696_µüÁö³îÀÌ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int m = 0; m < n; m++) {
            int[] a = new int[5];
            int[] b = new int[5];

            String[] temp = br.readLine().split(" ");
            for (int i = 1; i < temp.length; i++) {
                int index = Integer.parseInt(temp[i]);

                a[index]++;
            }
            temp = br.readLine().split(" ");
            for (int i = 1; i < temp.length; i++) {
                int index = Integer.parseInt(temp[i]);

                b[index]++;
            }

            if (a[4] > b[4]) {
                System.out.println("A");
            } else if (a[4] < b[4]) {
                System.out.println("B");
            } else {
                if (a[3] > b[3]) {
                    System.out.println("A");
                } else if (a[3] < b[3]) {
                    System.out.println("B");
                } else {
                    if (a[2] > b[2]) {
                        System.out.println("A");
                    } else if (a[2] < b[2]) {
                        System.out.println("B");
                    } else {
                        if (a[1] > b[1]) {
                            System.out.println("A");
                        } else if (a[1] < b[1]) {
                            System.out.println("B");
                        }else
                            System.out.println("D");
                    }
                }
            }
        }
    }
}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p11399_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] time = new int[n];
        int[] temp = new int[n];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(time);
        int leastTime = 0;
        for(int i = 0; i < n; i++) {
            temp[i] = time[i];

            if(i != 0) {
                temp[i] += temp[i-1];
            }
            leastTime += temp[i];
        }

        System.out.println(leastTime);

    }
}

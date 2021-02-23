package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p1789_수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long sum = 0;
        long index = 1;


        while (true) {
            sum += index +1;
            if(sum >= n)    break;
            index++;
        }

        System.out.println(index);
    }
}

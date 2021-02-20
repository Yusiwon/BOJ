package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p1644_소수의연속합 {

    static boolean[] prime;
    static int n;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        prime = new boolean[n + 1];
        prime[0] = true;
        prime[1] = true;
        getPrime();

        int count = 0;

        for(int i = 0; i < list.size(); i++) {
            int sum = 0;
            int index = i;

            while(sum < n && index < list.size()) {
                sum += list.get(index);
                index++;
            }

            if(sum == n) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void getPrime() {
        for(int i = 2; i*i <= n; i++) {
            if (!prime[i]) {
                for(int j = i*i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(!prime[i]) {
                list.add(i);
            }
        }
    }
}

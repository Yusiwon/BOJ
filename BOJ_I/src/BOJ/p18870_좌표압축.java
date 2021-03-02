package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p18870_ÁÂÇ¥¾ÐÃà {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(str[i]);
            arr[i] = num;
            if(!list.contains(num)) {
                list.add(num);
            }
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);

        for(int i = 0; i < n; i++) {
            sb.append(list.indexOf(arr[i])).append(" ");
        }

        System.out.println(sb.toString());
    }
}

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
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);

        }

        int[] sort = arr.clone();
        Arrays.sort(sort);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(sort[i])) {
                map.put(sort[i], index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb.toString());

    }
}

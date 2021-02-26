package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p11004_K¹øÂ°¼ö {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int size = Integer.parseInt(str[0]);
        int want = Integer.parseInt(str[1]);

        String[] temp = br.readLine().split(" ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(arr);
        System.out.println(arr[want-1]);
    }
}

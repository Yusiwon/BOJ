package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int cycle = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[size+1];
        int inSum = 0;
        arr[0] = 0;
        for (int i = 1; i < size+1; i++) {
            inSum += Integer.parseInt(st.nextToken());
            arr[i] = inSum;
        }


        for (int i = 0; i < cycle; i++) {
            StringTokenizer range = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(range.nextToken());
            int end = Integer.parseInt(range.nextToken());

            System.out.println(arr[end] - arr[start-1]);
        }
    }
}

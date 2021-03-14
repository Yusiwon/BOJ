package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2822_점수계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] temp = new int[8];
        int[] max = new int[5];

        for (int i = 0; i < 8; i++) {
            temp[i] = arr[i];
        }
        int count = 0;
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 3; i < 8; i++) {
            max[count] = arr[i];
            sum += max[count];
            count++;
        }

        System.out.println(sum);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (temp[i] == max[j]) {
                    System.out.print(i+1 + " ");
                }
            }
        }
    }
}

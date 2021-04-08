package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15312_¿Ã∏ß±√«’ {
    public static void main(String[] args) throws IOException {

        int[] alpha = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        int size = first.length();

        int[] arr = new int[size * 2];

        for (int i = 0; i < size; i++) {
            int index = first.charAt(i) - 'A';
            arr[i * 2] = alpha[index];

            index = second.charAt(i) - 'A';
            arr[i * 2 + 1] = alpha[index];
        }
        size = size * 2 - 1;

        while (size > 1) {
            for (int i = 0; i < size; i++) {
                arr[i] = (arr[i]+ arr[i+1])%10;
            }
            arr[size] = 0;
            size--;
        }

        String result = String.valueOf(arr[0] % 10) + String.valueOf(arr[1] % 10);
        System.out.println(result);

    }
}

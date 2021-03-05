package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10973_이전순열 {

    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] temp = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        prePermutation(arr);

    }

    public static void prePermutation(int[] arr) {
        boolean bool = true;

        Loop1 : for(int i = n-1; i > 0; i--) {
            if(arr[i-1] > arr[i]) {

                for(int j = n-1; j >= i; j--) {
                    if(arr[j] < arr[i-1]) {
                        int temp = arr[i-1];
                        arr[i-1] = arr[j];
                        arr[j] = temp;
                        int k = n-1;

                        while(i < k) {
                            int tm = arr[i];
                            arr[i] = arr[k];
                            arr[k] = tm;
                            i++;
                            k--;
                        }
                        bool = false;
                        break Loop1;
                    }
                }
            }
        }

        if(bool) {
            System.out.println(-1);
        }
        else {
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

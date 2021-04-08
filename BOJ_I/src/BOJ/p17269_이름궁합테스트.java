package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17269_이름궁합테스트 {

    public static void main(String[] args) throws IOException {

        int[] alph = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int firSize = Integer.parseInt(str[0]);
        int secSize = Integer.parseInt(str[1]);
        int[] arr = new int[firSize + secSize];

        String[] name = br.readLine().split(" ");
        String firName = name[0];
        String secName = name[1];

        int minSize = Math.min(firSize, secSize);
        int maxSize = Math.max(firSize, secSize);

        for (int i = 0; i < minSize; i++) {
            int index = (firName.charAt(i) - 'A');
            arr[i*2] = alph[index];

            index = (secName.charAt(i) - 'A');
            arr[i * 2 + 1] = alph[index];
        }

        if (firSize < secSize) {
            for (int i = minSize; i < maxSize; i++) {
                int index = (secName.charAt(i) - 'A');
                arr[i + minSize] = alph[index];
            }
        } else {
            for (int i = minSize; i < maxSize; i++) {
                int index = (firName.charAt(i) - 'A');
                arr[i + minSize] = alph[index];
            }
        }



        int size = arr.length-1;
        while (size > 1) {
            for (int i = 0; i < size; i++) {
                arr[i] += arr[i + 1];
            }
            arr[size] = 0;
            size--;

        }
        int result = (arr[0] % 10) * 10 + arr[1] % 10;

        System.out.println(result + "%");

    }


}

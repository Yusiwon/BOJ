package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9663_N_Queen {

    static int n;
    static int count = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        nQueen(0);
        System.out.println(count);
    }

    public static void nQueen(int depth) {
        // ��� ���Ҹ� �� ä�� ���¸� count���� �� return
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            // ���� �� �ִ� ��ġ�� ��� ���ȣ��
            if (isPossible(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    public static boolean isPossible(int col) {
        for (int i = 0; i < col; i++) {
            // �ش� ���� ��� i���� ���� ��ġ�� ��� (���� �࿡ ������ ���)
            if (arr[col] == arr[i]) {
                return false;
            }

            /*
            �밢���� �����մ°��
            (���� ���� ���� ���� ���� ��찡 �밢���� �����ִ� ���)
             */
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}

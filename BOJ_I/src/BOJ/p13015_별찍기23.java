package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p13015_º°Âï±â23 {

    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        bodyTop();
    }

    public static void startEnd() {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < 2 * (n - 1) - 1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void bodyTop() {

        startEnd();
        System.out.println();

        for (int i = 1; i <= n - 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 2*i-1; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        bodyMid();
    }

    public static void bodyMid() {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        bodyButtom();
    }

    public static void bodyButtom() {

        for (int i = 1; i <= n - 2; i++) {
            for (int j = 0; j < (n-1)-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        startEnd();
    }
}

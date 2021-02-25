package BOJ;

import java.util.Scanner;

public class p10992_º°Âï±â17 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i = 1; i < n; i++) {
            for(int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for(int j = 0; j < (i-1)*2-1; j++) {
                System.out.print(" ");
            }
            if(i != 1)	System.out.print("*");
            System.out.println();
        }
        for(int i = 0; i < n*2-1; i++) {
            System.out.print("*");
        }
    }

}


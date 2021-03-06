package BOJ;

import java.util.Scanner;

public class p15727_조별과제를하려는데조장이사라졌다 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n%5 == 0) {
            System.out.println(n/5);
        }
        else {
            System.out.println((n/5)+1);
        }
    }
}

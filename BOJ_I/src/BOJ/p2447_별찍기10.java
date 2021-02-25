package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2447_º°Âï±â10 {

    static char[][] print;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int number = Integer.parseInt(s);

        print = new char[number][number];
        for(int i= 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                print[i][j] = ' ';
            }
        }
        star(0, 0, number);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                sb.append(print[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);

    }

    public static void star(int x, int y, int num){

        if(num == 1) {
            print[y][x] = '*';
        }

        else {
            int dep = num/3;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(i==1 && j==1){
                        continue;
                    }


                    star(x+j*dep, y+i*dep, dep);

                }
            }
        }
    }
}


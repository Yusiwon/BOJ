package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p17496_½ºÅ¸ÈÄ¸£Ã÷ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int day = Integer.parseInt(str[0]);
        int take = Integer.parseInt(str[1]);
        int howMany = Integer.parseInt(str[2]);
        int price = Integer.parseInt(str[3]);

        int result = (day-1)/take;
        result = result*howMany;
        result = result*price;

        System.out.println(result);
    }
}

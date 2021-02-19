package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2869_달팽이는올라가고싶다 {

	public static void main(String[] args) throws Exception{
		// 버퍼를 통해 입력을 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		// 올라가기 위한 날짜를 계산
		System.out.println((int) Math.ceil((double) (V - A) / (double) (A - B)) + 1);

	}
}

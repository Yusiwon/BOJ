package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2869_�����̴¿ö󰡰�ʹ� {

	public static void main(String[] args) throws Exception{
		// ���۸� ���� �Է��� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		// �ö󰡱� ���� ��¥�� ���
		System.out.println((int) Math.ceil((double) (V - A) / (double) (A - B)) + 1);

	}
}

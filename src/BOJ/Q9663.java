package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9663 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			int[] cols = new int[n];

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * 1) N�� ũ�� �Է� ���� - main
 * 
 * nqueen 2) 0���� ���� ��ġ���� ��, ���� ���� ��ġ�� �� �ִ� ��ġ�� ã�� 2-1) ���� ��ġ�� �������� �˻� 2-2) N��
 * �Ǿ��ٸ� ��� 2-3) 1�� �����ϸ� ���ȣ��
 * 
 * 
 * promising (������ �ڽĳ������ üũ) 3) n���� ũ�⸦ ���鼭 ���� �࿡ ��ġ�� �� �����Ƿ� false �밢���� ��ġ�� ��
 * �����Ƿ� false
 */
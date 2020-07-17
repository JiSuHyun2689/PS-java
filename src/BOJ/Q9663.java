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
 * 1) N의 크기 입력 받음 - main
 * 
 * nqueen 2) 0부터 퀸이 위치했을 때, 다음 퀸이 위치할 수 있는 위치를 찾기 2-1) 현재 위치가 유망한지 검사 2-2) N이
 * 되었다면 출력 2-3) 1씩 증가하며 재귀호출
 * 
 * 
 * promising (유망한 자식노드인지 체크) 3) n개의 크기를 돌면서 같은 행에 위치할 수 없으므로 false 대각선에 위치할 수
 * 없으므로 false
 */
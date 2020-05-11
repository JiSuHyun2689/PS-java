package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q2667 {

//	���簢�� ����� ����(2���� �迭)�� �־��� ��, ���� ���� ����ϰ� �� ������ ���ϴ� ���� ���� ������������ �����Ͽ� ��� 
//  �Է� 1 : ������ ũ�� N(���簢��), 5 <= N <= 25 
//	�Է� 2 : N���� �迭
//	  
//	1) �Էµ� �迭 (0,0) ���� ��ȸ
//	2) ���� ���� �ִٸ� DFS ��ȸ
//	3) �ش� �� �湮 ó�� �� �湮�� �� ���� cnt++
//	4) �ش� ���� ���� �迭 Ž��
//	5) �迭�� ũ�⸦ ����� �ʰ�, 1�̶�� DFS Ž��
//	6) ���������� �湮 ���� houses�� add

	static int[][] adj;
	static int cnt; // �湮�� �� ���� ī��Ʈ
	static PriorityQueue<Integer> houses; // ���������� �� ����
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			adj = new int[n][n];
			houses = new PriorityQueue<Integer>();
			int total = 0;
			for (int i = 0; i < n; i++) {
				String[] tmp = br.readLine().split("");
				for (int j = 0; j < n; j++) {
					adj[i][j] = Integer.parseInt(tmp[j]);
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (adj[i][j] == 1) {
						cnt = 0;
						total++;
						dfs(i, j, n);
						houses.add(cnt);
					}
				}
			}

			bw.write(String.valueOf(total) + "\n");

			while (!houses.isEmpty())
				bw.write(houses.poll() + "\n");

			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void dfs(int x, int y, int n) {

		// ���� ��ġ �湮 ǥ��
		adj[x][y] = 0;
		cnt++;

		for (int i = 0; i < 4; i++) {
			// ���� �迭 Ž��
			int newX = x + dx[i];
			int newY = y + dy[i];

			// adj �迭 �ʰ��ϴ� �� �ǳ� �ٱ�
			if (newX < 0 || newX >= n || newY < 0 || newY >= n)
				continue;
			// ���� �� ������ �� �ִٸ� dfs ��ȸ
			if (adj[newX][newY] == 1)
				dfs(newX, newY, n);

		}
	}
}

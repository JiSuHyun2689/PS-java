package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q7569 {

	// �Է� 1 : ������ ũ�� M, N (2 <= M <= 100 , 2 <= N <= 1000), ������ ���� H(1 <= H <= 100)
	// �Է� 2 : �ϳ��� ���ڿ� ���ڵ� �丶����� ����(N���� ��)
	// -1�� �丶�䰡 ������� ����
	// �丶�䰡 ��� ���� �������� �ּ� ��¥ ���
	// ����� ������ ��� �丶�䰡 �;��ִ� ���¸� 0 ���, ��� ���� ���ϴ� ��Ȳ���� -1 ���

	static int n, m, h;
	static int[][][] adj;
	static int[] dx = { 0, 1, 0, -1, 0, 0 };
	static int[] dy = { -1, 0, 1, 0, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };
	static Queue<Node> queue;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			queue = new LinkedList<Node>();

			n = Integer.parseInt(tmp[0]);
			m = Integer.parseInt(tmp[1]);
			h = Integer.parseInt(tmp[2]);
			adj = new int[h][m][n];

			for (int k = 0; k < h; k++) {
				for (int i = 0; i < m; i++) {
					tmp = br.readLine().split(" ");
					for (int j = 0; j < n; j++) {
						int num = Integer.parseInt(tmp[j]);
						adj[k][i][j] = num;
						if (num == 1)
							queue.add(new Node(i, j, k, 0));
					}
				}
			}

			bw.write(String.valueOf(dfs()));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int dfs() {

		int day = 0;

		while (!queue.isEmpty()) {

			Node current = queue.poll();
			day = current.day;

			for (int i = 0; i < 6; i++) {
				int newX = current.x + dx[i];
				int newY = current.y + dy[i];
				int newZ = current.z + dz[i];

				if (0 <= newX && newX < m && 0 <= newY && newY < n && 0 <= newZ && newZ < h) {
					if (adj[newZ][newX][newY] == 0) {
						adj[newZ][newX][newY] = 1;
						queue.add(new Node(newX, newY, newZ, day + 1));
					}
				}
			}
		}

		if (checkAdj())
			return day;
		else
			return -1;

	}

	static boolean checkAdj() {
		for (int k = 0; k < h; k++) {
			for (int i = 0; i < m; i++)
				for (int j = 0; j < n; j++)
					if (adj[k][i][j] == 0)
						return false;
		}
		return true;
	}

	static class Node {
		int x;
		int y;
		int z;
		int day;

		public Node(int x, int y, int z, int day) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.day = day;
		}
	}
}

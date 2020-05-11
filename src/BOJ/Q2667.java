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

//	정사각형 모양의 지도(2차원 배열)이 주어질 때, 단지 수를 출력하고 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력 
//  입력 1 : 지도의 크기 N(정사각형), 5 <= N <= 25 
//	입력 2 : N개의 배열
//	  
//	1) 입력된 배열 (0,0) 부터 순회
//	2) 만약 집이 있다면 DFS 순회
//	3) 해당 집 방문 처리 후 방문한 집 개수 cnt++
//	4) 해당 집의 인접 배열 탐색
//	5) 배열의 크기를 벗어나지 않고, 1이라면 DFS 탐색
//	6) 단지마다의 방문 개수 houses에 add

	static int[][] adj;
	static int cnt; // 방문한 집 개수 카운트
	static PriorityQueue<Integer> houses; // 단지마다의 집 개수
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

		// 현재 위치 방문 표시
		adj[x][y] = 0;
		cnt++;

		for (int i = 0; i < 4; i++) {
			// 인접 배열 탐색
			int newX = x + dx[i];
			int newY = y + dy[i];

			// adj 배열 초과하는 값 건너 뛰기
			if (newX < 0 || newX >= n || newY < 0 || newY >= n)
				continue;
			// 단지 내 인접한 집 있다면 dfs 순회
			if (adj[newX][newY] == 1)
				dfs(newX, newY, n);

		}
	}
}

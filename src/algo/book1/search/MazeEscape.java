package algo.book1.search;

import java.util.LinkedList;
import java.util.Queue;

public class MazeEscape {

	public static int n, m;
	public static int[][] map;
	public static int result = 0;
	public static int[] dx = { -1, 0, 1, 0 };
	public static int[] dy = { 0, -1, 0, 1 };

	public static int bfs(int x, int y) {

		Queue<Location> queue = new LinkedList<>();
		queue.add(new Location(x, y));

		while (!queue.isEmpty()) {
			Location current = queue.poll();
			for (int i = 0; i < dx.length; i++) {
				int nx = current.x + dx[i];
				int ny = current.y + dy[i];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;

				if (map[nx][ny] == 1) {
					map[nx][ny] = map[current.x][current.y] + 1;
					queue.add(new Location(nx, ny));

				}
			}

		}

		return map[n - 1][m - 1];
	}

	public static void main(String[] args) {

		n = 3;
		m = 3;
		//String str = "101010\n111111\n000001\n111111\n111111";
		 String str = "110\n010\n011";
		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			String[] temp = str.split("\n");
			String[] t = temp[i].split("");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(t[j]);
			}
		}

		System.out.println(bfs(0, 0));

	}

	public static class Location {
		public int x;
		public int y;

		public Location(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Location [x=" + x + ", y=" + y + "]";
		}
	}
}

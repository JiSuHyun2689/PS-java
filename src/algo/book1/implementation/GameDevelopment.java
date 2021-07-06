package algo.book1.implementation;

public class GameDevelopment {

	public static int solution(int n, int m, int[][] map, int x, int y, int direction) {

		boolean[][] visited = new boolean[n][m];
		int turnTime = 0;
		int count = 1;
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		visited[x][y] = true;

		while (true) {
			direction = turnLeft(x, y, direction);
			int nx = x + dx[direction];
			int ny = y + dy[direction];

			if (visited[nx][ny] == false && map[nx][ny] == 0) {
				visited[nx][ny] = true;
				x = nx;
				y = ny;
				count++;
				turnTime = 0;
				continue;
			} else {
				turnTime++;
			}

			if (turnTime == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];
				if (map[nx][ny] == 0) {
					x = nx;
					y = ny;
				} else {
					break;
				}
				turnTime = 0;
			}

		}
		return count;
	}

	public static int turnLeft(int x, int y, int direction) {
		direction -= 1;
		if (direction == -1)
			direction = 3;
		return direction;
	}

	public static void main(String[] args) {
		int[][] map = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };
		System.out.println(solution(4, 4, map, 1, 1, 0));
	}

}

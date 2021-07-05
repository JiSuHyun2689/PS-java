package algo.book1.implementation;

import java.util.HashMap;
import java.util.Map;

public class UpDownLeftRight {

	public static Map<String, Xy> udlr = new HashMap<>();
	public static int n = 0;

	public static String solution(int n, String str) {
		UpDownLeftRight.n = n;
		String[] moving = str.split(" ");
		Xy xy = new Xy(1, 1);

		for (int i = 0; i < moving.length; i++) {
			xy = move(xy, moving[i]);
		}

		// start (1,1)

		return xy.toString();
	}

	public static Xy move(Xy currentXy, String move) {
		Xy xy = udlr.get(move);
		int currentX = currentXy.x;
		int currentY = currentXy.y;
		int x = xy.x;
		int y = xy.y;
		
		System.out.println("current = " + currentXy.toString() + ", x = " + x + ", y = " + y +", move = " + move);

		if (currentX + x <= 0 || currentX + x >= n || currentY + y <= 0 || currentX + y >= n) {
			System.out.println("Pass current = " + currentXy.toString() + ", x = " + x + ", y = " + y +", move = " + move);
			return currentXy;
		}

		currentX += x;
		currentY += y;

		return currentXy;

	}

	public static void initUdlr() {
		udlr.put("U", new Xy(0, -1));
		udlr.put("D", new Xy(1, 0));
		udlr.put("L", new Xy(-1, 0));
		udlr.put("R", new Xy(0, 1));
	}

	public static class Xy {
		int x;
		int y;

		public Xy(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "("+x+","+y+")";
		}
	}

	public static void main(String[] args) {
		initUdlr();
		String str = "R R R U D D";
		System.out.println(solution(5, str));
	}
}

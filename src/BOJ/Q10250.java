package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int testCase = Integer.parseInt(br.readLine());

			for (int i = 0; i < testCase; i++) {

				StringTokenizer tk = new StringTokenizer(br.readLine());
				int h = Integer.parseInt(tk.nextToken());
				int w = Integer.parseInt(tk.nextToken());
				int n = Integer.parseInt(tk.nextToken());
				int room = 0, count = 1;

				loop: for (int xx = 1; xx <= w; xx++) {
					for (int y = 1; y <= h; y++) {
						room = y * 100 + xx;

						if (count == n) {
							break loop;
						}
						count++;
					}
				}
				System.out.println(room);
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11729 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int n = Integer.parseInt(br.readLine());
			int result = ((int) Math.pow(2, n)) - 1;

			bw.write(result + "\n");

			hanoi(n, 1, 2, 3);

			br.close();
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void move(int from, int to) throws Exception {
		bw.write(from + " " + to + "\n");
	}

	public static void hanoi(int n, int from, int by, int to) throws Exception {
		if (n == 1)
			move(from, to);
		else {
			hanoi(n - 1, from, to, by);
			move(from, to);
			hanoi(n - 1, by, from, to);
		}
	}
}

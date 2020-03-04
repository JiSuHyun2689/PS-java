package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");

			long a = Integer.parseInt(tk.nextToken());
			long b = Integer.parseInt(tk.nextToken());
			long v = Integer.parseInt(tk.nextToken());

			int day = (int) (Math.ceil((v - a) / (a - b)) + 1);
			if ((v - a) % (a - b) != 0)
				day++;
			System.out.println(day);

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

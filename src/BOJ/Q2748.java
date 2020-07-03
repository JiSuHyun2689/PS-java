package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Q2748 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			long cnt = 0;
			LinkedList<Long> list = new LinkedList<Long>();

			while (cnt <= n) {
				if (cnt < 2)
					list.add(cnt);
				else
					list.add(list.get((int) (cnt - 1)) + list.get((int) (cnt - 2)));
				cnt++;
			}

			bw.write(String.valueOf(list.get(n)));
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

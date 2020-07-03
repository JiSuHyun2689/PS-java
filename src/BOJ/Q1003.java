package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Q1003 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int tc = Integer.parseInt(br.readLine());

			for (int i = 0; i < tc; i++) {
				foundFibonacci(Integer.parseInt(br.readLine()), bw);
			}

			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void foundFibonacci(int n, BufferedWriter bw) throws Exception {
		
		bw.write(String.valueOf(fibonacci(n, bw)));

	}

	static int fibonacci(int n, BufferedWriter bw) throws Exception {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1, bw) + fibonacci(n - 2, bw);
		}
	}

}

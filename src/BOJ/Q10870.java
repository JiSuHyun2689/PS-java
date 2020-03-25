package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10870 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.println(Fibonacci(Integer.parseInt(br.readLine())));
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int Fibonacci(int n) {

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);

	}
}

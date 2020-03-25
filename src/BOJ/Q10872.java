package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10872 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.println(factorial(Integer.parseInt(br.readLine())));

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int factorial(int num) {

		if (num <= 1)
			return 1;
		else
			return num * factorial(num - 1);

	}

}

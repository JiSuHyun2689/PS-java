package BOJ;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10950 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = Integer.parseInt(scanner.nextLine());
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a < 0 || b > 10)
				return;
			result.add(a + b);
		}

		result.forEach(sum -> System.out.println(sum));
		scanner.close();
	}
}

package BOJ;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Q9012 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int count = Integer.parseInt(br.readLine());

			for (int i = 0; i < count; i++) {
				System.out.println(checkVPS(br.readLine()));
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	private static String checkVPS(String line) {

		Stack<Integer> stack = new Stack<>();

		for (String string : line.split("")) {

			if (string.equals("("))
				stack.push(1);
			else if (string.equals(")")) {
				if (stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}

		if (stack.isEmpty())
			return "YES";
		else
			return "NO";
	}

}

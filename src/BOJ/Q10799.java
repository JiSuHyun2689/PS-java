import java.util.Scanner;
import java.util.Stack;


public class Q10799 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split("");

		Stack<String> stack = new Stack<>();
		int result = 0;
		String prev = null;

		for (String current : line) {

			if (current.equals("(")) {
				stack.push(current);
			} else {
				if (prev.equals("(")) {
					// ������
					result += stack.size()-1;
				} else {
					// ������ �ƴ� ��
					result++;
				}
				stack.pop();
			}
			prev = current;
		}
		System.out.println(result);
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828 {

	public static Stack<Integer> stack;
	public static String[] func = {"push", "pop", "top", "size", "empty"};
	
	public static void main(String[] args) {

		stack = new Stack<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				//
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void push(int num) {
		stack.push(num);
	}

	public void pop() {
		System.out.println(stack.pop());
	}

	public void size() {
		System.out.println(stack.size());
	}

	public void empty(int num) {
		if(stack.isEmpty())
			System.out.println("1");
		else System.out.println("0");
	}

	public void top(int num) {
		if(stack.isEmpty()) {
			System.out.println("-1");
			return;
		}
		System.out.println(stack.get(stack.size()));
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Stack;

public class Q10828 {

	public static Stack<Integer> stack;

	public static void main(String[] args) {

		stack = new Stack<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			// Reflection
			Class classMy = Q10828.class;
			Object obj = classMy.newInstance();
			Method method = null;
			int count = Integer.parseInt(br.readLine());

			for (int i = 0; i < count; i++) {
				String[] arr = br.readLine().split(" ");
				
				if (arr[0].equals("push")) {
					// method has parameters
					method = classMy.getMethod(arr[0], new Class[] {Integer.class });
					method.invoke(obj, Integer.parseInt(arr[1]));
				} else {
					// method has no parameters
					method = classMy.getMethod(arr[0]);
					method.invoke(obj);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void push(Integer num) {
		stack.push(num);
	}

	public void pop() {
		if (stack.isEmpty())
			System.out.println("-1");
		else
			System.out.println(stack.pop());
	}

	public void size() {
		System.out.println(stack.size());
	}

	public void empty() {
		if (stack.isEmpty())
			System.out.println("1");
		else
			System.out.println("0");
	}

	public void top() {
		if (stack.isEmpty())
			System.out.println("-1");
		else
			System.out.println(stack.get(stack.size() - 1));
	}
}

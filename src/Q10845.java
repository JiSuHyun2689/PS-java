import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Q10845 {
	
	static List<Integer> queue;

	public static void main(String[] args) {
		
		queue = new LinkedList<>(
				
				);
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int count = br.read();
			Class clz = Q10845.class;
			Object obj = clz.newInstance();
			Method method;

			while (count-- > 0) {
				String[] input = br.readLine().split(" ");

				if (input.length > 1) {
					method = clz.getMethod(input[0], Integer.class);
					method.invoke(obj, input[1]);
				} else {
					method = clz.getMethod(input[0]);
					method.invoke(obj);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void push(int input) {
		
	}
	
	public void pop() {
		
	}
	
	public void size() {
	
	}
	
	public void empty() {
		
	}
	
	public void front() {
		
	}
	
	public void back() {
		
	}
}

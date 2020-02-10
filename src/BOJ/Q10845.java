import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Q10845 {
	
	static List<Integer> queue;
	static int front, back;
	
	public static void main(String[] args) {
		
		queue = new LinkedList<>();
		front = 0;
		back = 0;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int count = Integer.parseInt(br.readLine());
			Class clz = Q10845.class;
			Object obj = clz.newInstance();
			Method method = null;

			while (count-- > 0) {
				String[] input = br.readLine().split(" ");

				if (input.length >= 2) {
					method = clz.getMethod(input[0],new Class[] {Integer.class });
					method.invoke(obj, Integer.parseInt(input[1]));
				} else {
					method = clz.getMethod(input[0]);
					method.invoke(obj);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void push(Integer input) {
		queue.add(input);
		back++;
	}
	
	public void pop() {
		if(queue.size() <= 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(queue.remove(front));
		back--;
	}
	
	public void size() {
		System.out.println(queue.size());
	}
	
	public void empty() {
		if(queue.isEmpty())
			System.out.println("1");
		else 
			System.out.println(0);
	}
	
	public void front() {
		if(queue.size() <= 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(queue.get(front));
	}
	
	public void back() {
		if(queue.size() <= 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(queue.get(back-1));
	}
}

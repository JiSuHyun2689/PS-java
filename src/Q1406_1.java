import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class Q1406_1 {

	static List<String> list;
	static int cursor;

	public static void main(String[] args) {

		list = new LinkedList<>();
		
		Scanner scan = new Scanner(System.in);

		String[] arr = scan.nextLine().split("");

		if (arr.length > 100000)
			return;

		cursor = arr.length;
		System.out.println("Cursor first position: "+cursor +", input size : " + arr.length);
		
		Arrays.stream(arr).filter(str -> Pattern.matches("^[a-z]*$", str)).forEach(str -> list.add(str));

		int count = Integer.parseInt(scan.nextLine());

		if (count > 500000 || count < 0)
			return;

		try {
			Class clz = Q1406_1.class;

			Object obj = clz.newInstance();

			Method method;

			for (int i = 0; i < count; i++) {

				String[] input = scan.nextLine().split(" ");

				if (input.length > 1) {
					method = clz.getMethod(input[0], String.class);
					method.invoke(obj, input[1]);
				} else {
					method = clz.getMethod(input[0]);
					method.invoke(obj);
				}
			}
			
			list.forEach(str -> System.out.print(str));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void L() {
		if(cursor == -1) {
			return;
		}
		cursor--;
	}
	
	public void D() {
		if(cursor == list.size()) {
			return;
		}
		cursor++;
	}
	
	public void B() {
		if(cursor == -1 || cursor == 0) {
			return;
		}
		list.remove(cursor-1);
		cursor--;
	}
	
	public void P(String input) {
		if(cursor == -1) {
			list.add(0, input);
			return;
		}
		list.add(cursor, input);
		cursor++;
	}
	
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1406 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();

		StringBuilder output = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String[] inputStr = br.readLine().split("");

			int inputStrLen = inputStr.length;

			int cursor = inputStrLen;
			
			for (int i = 0; i < inputStrLen; i++) {
				stack.push(inputStr[i]);
			}

			int count = Integer.parseInt(br.readLine());

			synchronized (java.lang.Object.class) {
				while (count-- > 0) {
					String[] func = br.readLine().split(" ");

					if (func[0].equals("L")) {
						if(cursor == 0) {
							continue;
						}
						cursor--;
					} else if (func[0].equals("D")) {
						if(cursor == stack.size()) {
							continue;
						}
						cursor++;
					} else if (func[0].equals("B")) {
						if(cursor < 1) {
							continue;
						}
						stack.remove(cursor-1);
						cursor--;
					} else {
						if(cursor < 1) {
							stack.add(0, func[1]);
							cursor++;
							continue;
						}
						stack.add(cursor, func[1]);
						cursor++;
					}
				}
			}

			for (String str : stack) {
				output.append(str);
			}
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
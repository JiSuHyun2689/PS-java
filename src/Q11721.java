import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11721 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br.readLine();
			int len = str.length() / 10;

			for (int i = 0; i < len + 1; i++) {
				if (i == len)
					System.out.println(str.substring((i * 10)));
				System.out.println(str.substring((i * 10), (i * 10) + 10));
			}

		} catch (Exception e) {
		}
	}
}

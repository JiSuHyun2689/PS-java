package BOJ;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			StringTokenizer tk = new StringTokenizer(br.readLine(), " ");
			int size = tk.countTokens();
			int[] input = new int[size];

			for (int i = 0; i < size; i++)
				input[i] = Integer.parseInt(tk.nextToken());

			if (input[2] - input[1] <= 0)
				System.out.println("-1");
			else
				System.out.println(input[0] / (input[2] - input[1]) + 1);

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

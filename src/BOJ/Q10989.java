package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int size = Integer.parseInt(br.readLine());
			int arr[] = new int[10001];

			for (int i = 0; i < size; i++)
				arr[Integer.parseInt(br.readLine())]++;

			for (int i = 0; i < 10001; i++) {
				if (arr[i] > 0) {
					for (int j = 0; j < arr[i]; j++)
						bw.write(Integer.toString(i) + "\n");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

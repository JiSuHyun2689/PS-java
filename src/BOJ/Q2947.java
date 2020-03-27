package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2947 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String[] input = br.readLine().split(" ");
			int length = input.length;
			arr = new int[length];

			for (int i = 0; i < length; i++) {
				arr[i] = Integer.parseInt(input[i]);
			}

			sort(arr);

			bw.flush();
			bw.close();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void sort(int[] arr) throws Exception {
		int temp;
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					for (int target : arr)
						bw.write(target + " ");
					bw.write("\n");
				}
			}
		}
	}

}

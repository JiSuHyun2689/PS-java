package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Q10814 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int tc = Integer.parseInt(br.readLine());
			String[] temp;
			String[][] arr = new String[tc][2];

			for (int i = 0; i < tc; i++) {
				temp = br.readLine().split(" ");
				arr[i][0] = temp[0];
				arr[i][1] = temp[1];
			}

			Arrays.sort(arr, new Comparator<String[]>() {
				public int compare(String[] o1, String[] o2) {
					return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
				}
			});

			for (String[] target : arr)
				bw.write(target[0] + " " + target[1] + "\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Q11650 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int tc = Integer.parseInt(br.readLine());
			int[][] point = new int[tc][2];
			String[] temp;
			
			for (int i = 0; i < tc; i++) {
				temp = br.readLine().split(" ");
				point[i][0] = Integer.parseInt(temp[0]);
				point[i][1] = Integer.parseInt(temp[1]);
			}

			Arrays.sort(point, new Comparator<int[]>() {
				public int compare(int a[], int b[]) {
					if (a[0] == b[0])
						return a[1] - b[1];
					else
						return a[0] - b[0];
				}
			});

			for (int[] target : point)
				bw.write(String.valueOf(target[0] + " " + target[1]) + "\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2750 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int size = Integer.parseInt(br.readLine());
			int min, temp, idx = 0;
			int[] arr = new int[size];

			for (int i = 0; i < size; i++)
				arr[i] = Integer.parseInt(br.readLine());

			for (int i = 0; i < size; i++) {
				min = 1001;
				for (int j = i; j < size; j++) {
					if (min > arr[j]) {
						min = arr[j];
						idx = j;
					}
				}
				temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}

			for (int target : arr)
				System.out.println(target);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

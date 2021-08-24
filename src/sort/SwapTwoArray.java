package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SwapTwoArray {

	public static int n;
	public static int k;
	public static Integer[] a, b;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		k = scanner.nextInt();
		a = new Integer[n];
		b = new Integer[n];
		scanner.nextLine();

		String[] temp = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(temp[i]);
		printArray(a);

		temp = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++)
			b[i] = Integer.parseInt(temp[i]);
		printArray(b);

		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());

		for (int i = 0; i < k; i++) {
			if (a[i] < b[i]) {
				int tempInt = a[i];
				a[i] = b[i];
				b[i] = tempInt;
			} else
				break;
		}
		int sum = 0;
		for (Integer target : a)
			sum += target;

		System.out.println(sum);

	}

	public static void printArray(Integer[] array) {
		for (Integer target : array)
			System.out.print(target + " ");
		System.out.println();
	}

}

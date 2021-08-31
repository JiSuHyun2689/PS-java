package algo.book1.sort;

import java.util.Arrays;
import java.util.Collections;

public class TopDown {

	public static void main(String[] args) {

		int[] array = { 15, 27, 12 };
		solution(array.length, array);

	}

	public static void printArray(Integer[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

	private static void solution(int length, int[] array) {

		Integer[] temp = Arrays.stream(array).boxed().toArray(Integer[]::new);

		Arrays.sort(temp, Collections.reverseOrder());

		printArray(temp);
	}

}

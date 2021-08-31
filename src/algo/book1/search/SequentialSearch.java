package algo.book1.search;

import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("생성할 원소 개수 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
		String[] inputData = scanner.nextLine().split(" ");
		int n = Integer.parseInt(inputData[0]);
		String target = inputData[1];

		System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸");
		inputData = scanner.nextLine().split(" ");

		System.out.println(sequentialSearch(n, target, inputData));

	}

	public static int sequentialSearch(int n, String target, String[] array) {

		int result = 0;

		for (int i = 0; i < array.length; i++)
			if (array[i].equals(target))
				result = i + 1;
		return result;
	}
}

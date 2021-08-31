package algo.book1.search;

import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ���� ���� �Է��� ���� �� ĭ ��� ã�� ���ڿ��� �Է��ϼ���.");
		String[] inputData = scanner.nextLine().split(" ");
		int n = Integer.parseInt(inputData[0]);
		String target = inputData[1];

		System.out.println("�ռ� ���� ���� ������ŭ ���ڿ��� �Է��ϼ���. ������ ���� �� ĭ");
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

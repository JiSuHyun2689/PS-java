package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HeapSort_BottomUp {

	static void swap(int[] heap, int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}

	// �� ����
	static void heapify(int[] heap, int length, int i) {

		// ���� ���
		int c = 2 * i + 1;

		// ������ �ڽ� ��尡 �ְ�, ���� �ڽ� ��庸�� ũ�ٸ�
		if (c < length - 1 && heap[c] < heap[c + 1])
			c++;

		// �θ� ����� �ڽ� ��尡 ũ�ٸ� ��ȯ
		if (c < length && heap[i] < heap[c])
			swap(heap, i, c);

		// ������ /2 ������ ����
		if (c <= length / 2)
			heapify(heap, length, c);

	}

	static void heapSort(int[] heap, int length) {

		// �� ����
		for (int i = length / 2; i >= 0; i--)
			heapify(heap, length, i);

		int root, c;

		// ����
		for (int i = length - 1; i >= 0; i--) {

			swap(heap, 0, i); // ��Ʈ ��带 �� ������ ���� ��ü

			root = 0;
			c = 1;

			while (c < i) {
				c = 2 * root + 1;

				// �ڽ� ��� �� �� ū ��� ã��
				if (c < i - 1 && heap[c] < heap[c + 1])
					c++;

				// ��Ʈ ��庸�� �ڽ� ��尡 ũ�ٸ� ��ȯ
				if (c < i && heap[root] < heap[c])
					swap(heap, root, c);

				root = c;
			}
		}
	}

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			int[] heap = new int[n];

			for (int i = 0; i < n; i++)
				heap[i] = Integer.parseInt(br.readLine());

			heapSort(heap, heap.length);

			for (int target : heap)
				bw.write(target + " ");

			bw.flush();
			bw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

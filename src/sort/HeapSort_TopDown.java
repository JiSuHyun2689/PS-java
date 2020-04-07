package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class HeapSort_TopDown {

	static void swap(int[] heap, int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}

	static void heapSort(int[] heap, int length) {

		int root, c;

		// 최대 힙 구성
		for (int i = 1; i < length; i++) {
			c = i;
			while (c != 0) {
				root = (c - 1) / 2;
				if (heap[root] < heap[c])
					swap(heap, root, c);
				c = root;
			}
		}

		// 크기를 줄여가며 힙 구성
		for (int i = length - 1; i >= 0; i--) {
			swap(heap, 0, i); // 루트 노드를 맨 마지막 노드와 교체

			root = 0;
			c = 1;

			while (c < i) {
				c = 2 * root + 1;

				// 자식 노드 중 더 큰 노드 찾기
				if (c < i - 1 && heap[c] < heap[c + 1])
					c++;

				// 루트 노드보다 자식 노드가 크다면 교환
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

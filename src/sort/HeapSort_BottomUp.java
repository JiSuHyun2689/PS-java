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

	// 힙 생성
	static void heapify(int[] heap, int length, int i) {

		// 왼쪽 노드
		int c = 2 * i + 1;

		// 오른쪽 자식 노드가 있고, 왼쪽 자식 노드보다 크다면
		if (c < length - 1 && heap[c] < heap[c + 1])
			c++;

		// 부모 노드모다 자식 노드가 크다면 교환
		if (c < length && heap[i] < heap[c])
			swap(heap, i, c);

		// 길이의 /2 까지만 수행
		if (c <= length / 2)
			heapify(heap, length, c);

	}

	static void heapSort(int[] heap, int length) {

		// 힙 생성
		for (int i = length / 2; i >= 0; i--)
			heapify(heap, length, i);

		int root, c;

		// 정렬
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

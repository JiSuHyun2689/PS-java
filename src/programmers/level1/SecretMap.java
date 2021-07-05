package programmers.level1;

import java.util.Arrays;

public class SecretMap {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = checkMap(n, transBinary(n, arr1[i] | arr2[i]));			
		}

		return answer;
	}

	static String checkMap(int n, int[] arr) {
		String str = "";
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 1)
				str += "#";
			else
				str += " ";
		}
		
		return str;
	}

	static int[] transBinary(int n, int num) {

		int[] remain = new int[n];
		int[] binary = new int[n];
		int i = 0;

		while (num != 1) {
			remain[i++] = num % 2;
			num /= 2;
		}
		remain[i] = num;

		for (int j = n - 1, k = 0; j >= 0; j--)
			binary[k++] = remain[j];

		return binary;
	}

	public static void main(String[] args) {
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		solution(5, arr1, arr2);
	}
}

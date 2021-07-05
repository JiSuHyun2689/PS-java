package programmers.level1;

public class SecretMap2 {

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}

		for (int i = 0; i < n; i++) {
			result[i] = String.format("%" + n + "s", result[i]);
			result[i] = result[i].replaceAll("1", "#");
			result[i] = result[i].replaceAll("0", " ");
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		solution(5, arr1, arr2);
	}
}

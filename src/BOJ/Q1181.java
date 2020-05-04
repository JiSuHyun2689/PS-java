package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Q1181 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			HashSet<String> hs = new HashSet<String>();
			int tc = Integer.parseInt(br.readLine());

			for (int i = 0; i < tc; i++)
				hs.add(br.readLine());

			String[] arr = new String[hs.size()];
			hs.toArray(arr);

			Arrays.sort(arr, new Comparator<String>() {
				@Override
				public int compare(String a, String b) {
					return Integer.compare(a.length(), b.length());
				}
			});

			int len, j;
			for (int i = 0; i < arr.length; i++) {
				len = arr[i].length();
				for (j = i + 1; j < arr.length; j++) {
					if (len != arr[j].length())
						break;
				}
				Arrays.sort(arr, i, j);
				i = j - 1;
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

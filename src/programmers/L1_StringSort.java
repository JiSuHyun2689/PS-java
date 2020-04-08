package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class L1_StringSort {

	public String[] solution(String[] strings, int n) {

		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				char c1 = a.charAt(n);
				char c2 = b.charAt(n);

				if (c1 == c2) {
					return a.compareTo(b);
				} else
					return c1 - c2;
			}
		});
		return strings;
	}
}

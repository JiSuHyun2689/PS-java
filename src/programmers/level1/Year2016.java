package programmers.level1;

import java.util.Scanner;

class Year2016 {
	/*
	 * public String solution(int a, int b) { String answer = "";
	 * 
	 * Calendar cal = new
	 * Calendar.Builder().setCalendarType("iso8601").setDate(2016, a-1, b).build();
	 * 
	 * answer = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new
	 * Locale("ko-KR")).toUpperCase();
	 * 
	 * return answer; }
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int allDate = 0;

		for (int i = 0; i < a - 1; i++) {
			allDate += date[i];
		}
		allDate += (b - 1);
		System.out.println(day[allDate % 7]);

	}

}
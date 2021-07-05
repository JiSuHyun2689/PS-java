package programmers.level2;

import java.util.*;

public class OpenChatRoom {
	class Solution {
		HashMap<String, String> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> ids = new ArrayList<>();

		public String[] solution(String[] record) {
			splitRecord(record);
			return printRecord();
		}

		public String[] printRecord() {
			String[] answer = new String[list.size()];
			int idx = 0;
			for (String target : list) {
				switch (target) {
				case "Enter":
					answer[idx] = map.get(ids.get(idx)) + "님이 들어왔습니다.";
					idx++;
					break;
				case "Leave":
					answer[idx] = map.get(ids.get(idx)) + "님이 나갔습니다.";
					idx++;
					break;
				}
			}
			return answer;
		}

		public void splitRecord(String[] record) {
			for (int i = 0; i < record.length; i++) {
				String[] temp = record[i].split(" ");
				putRecord(temp);
			}
		}

		public void putRecord(String[] temp) {
			if (!temp[0].equals("Leave"))
				map.put(temp[1], temp[2]);
			if (!temp[0].equals("Change")) {
				list.add(temp[0]);
				ids.add(temp[1]);
			}
		}
	}
}

package programmers;

public class L1_WaterMelon {
	class Solution {
		public String solution(int n) {
			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < n / 2; i++)
				sb.append("����");

			return n % 2 != 0 ? sb.append("��").toString() : sb.toString();
			// return new String(new char [n/2+1]).replace("\0", "����").substring(0,n);
		}
	}
}

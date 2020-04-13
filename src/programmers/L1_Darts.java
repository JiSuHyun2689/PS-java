package programmers;

import java.util.Arrays;

public class L1_Darts {

	public static int solution(String dartResult) {
		int answer = 0;
		int preNum = 0;
		
		char[] chars = dartResult.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			
			if(Character.isDigit(ch)) {
				preNum += ch;
			}
			
		

		}

		return answer;
	}

	public static void main(String[] args) {

		solution("1S2D*3T");
		solution("1D2S#10S");
		solution("1D2S0T");
		solution("1S*2T*3S");
		solution("1D#2S*3S");
		solution("1T2D3D#");
		solution("1D2S3T*");

	}
}

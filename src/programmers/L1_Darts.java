package programmers;

import java.util.Arrays;
import java.util.regex.Pattern;

public class L1_Darts {

	public static int solution(String dartResult) {
		int[] answer = new int[3];
		int preNum = 0;
		char[] chars = dartResult.toCharArray();
		int j = 0;
		System.out.println(dartResult);

		for (int i = 0; i < chars.length; i++) {

			if (Character.isDigit(chars[i])) {
				preNum = preNum * 10 + (chars[i] - '0');
				System.out.println("Num : " + preNum);
			} else {
				System.out.println("else preNum : " + preNum);
				switch (chars[i]) {
				case 'S':
					answer[j] = (int) Math.pow(preNum, 1);
					preNum = 0;
					j++;
					System.out.println(chars[i]);
					System.out.println("pN : " + preNum + " , " + (int) Math.pow(preNum, 1));
					System.out.println(chars[i] + ", answer[" + j + "]= " + answer[j]);
					break;

				case 'D':
					/*
					 * answer[j] = (int)Math.pow(preNum, 2); preNum = 0; System.out.println(chars[i]
					 * + ", answer["+j+"]= " +answer[j] ); System.out.println(chars[i]); j++;
					 */
					break;
				case 'T':
					System.out.println(chars[i]);
					System.out.println(chars[i]  + ", answer[" + j + "]= " + answer[j]);
					break;
				case '*':
					
					System.out.println(chars[i]);
					System.out.println(chars[i]  + ", answer[" + j + "]= " + answer[j]);
					break;
				case '#':
					System.out.println(chars[i]);
					System.out.println(chars[i]  + ", answer[" + j + "]= " + answer[j]);
					break;
				default:
					break;
				}
			}

		}
		System.out.println("-------------------");

		return Arrays.stream(answer).sum();
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

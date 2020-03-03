package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1193 {

	public static void main(String[] args) {

		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			int num = Integer.parseInt(br.readLine());
			int depth = 0;
			int numerator, denominator = 0;
			
			
			for(int i=1; ; i++) {
				num -= i;
				
				if(num < 0) {
					depth = i;
					break;
				}
			}
			
			if(depth % 2 == 0) {
				
				numerator = 1;
				denominator = depth;
				
				
			}else {
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

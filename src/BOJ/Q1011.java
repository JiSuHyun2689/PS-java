package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1011 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int testCase = Integer.parseInt(br.readLine());
			int target;
			
			for (int i = 0; i < testCase; i++) {
				String[] tmp = br.readLine().split(" ");
				target = Integer.parseInt(tmp[1]) - Integer.parseInt(tmp[0]); 
				
				System.out.println("Target : " + target);
				
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

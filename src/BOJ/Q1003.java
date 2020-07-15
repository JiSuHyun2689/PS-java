package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Q1003 {

	static int cntZero;
	static int cntOne;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int tc = Integer.parseInt(br.readLine());

			for (int i = 0; i < tc; i++)
				foundFibonacci(Integer.parseInt(br.readLine()), bw);

			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void foundFibonacci(int n, BufferedWriter bw) throws Exception {
		
		
		
		
		bw.write("\n");
		cntZero = cntOne = 0;
	}

	
}

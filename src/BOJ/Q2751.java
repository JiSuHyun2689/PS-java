package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int inputNum = Integer.parseInt(br.readLine());
			ArrayList data = new ArrayList<Integer>();

			for (int i = 0; i < inputNum; i++)
				data.add(Integer.parseInt(br.readLine()));

			Collections.sort(data);

			for (Object target : data)
				bw.write(target + "\n");

			bw.flush();
			bw.close();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

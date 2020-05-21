package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1018 {

	static int n, m;
	static String[][] chessBoard;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			n = Integer.parseInt(tmp[0]);
			m = Integer.parseInt(tmp[1]);
			chessBoard = new String[n][m];

			for (int i = 0; i < n; i++) {
				tmp = br.readLine().split("");
				for (int j = 0; j < m; j++) {
					chessBoard[i][j] = tmp[j];
				}
			}

			bw.write(String.valueOf(checkBoard(0, 0)));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static int checkBoard(int a, int b) {

		int needChange = 0;
		boolean firstCheck = chessBoard[a][b].equals("W") ? true : false;
		boolean check = chessBoard[a][b].equals("W") ? true : false;

		for (int i = a; i < a + 8; i++) {
			for (int j = b; j < b + 8; j++) {

				System.out.print(chessBoard[i][j] + " ");
				if (j == b && chessBoard[i][j].equals("W") && !firstCheck) {
					System.out.print("C1 ");
					needChange++;
					check = false;
				}
				else if (j == b && chessBoard[i][j].equals("W") && firstCheck) {
					System.out.print("C5 ");
					needChange++;
					check = false;
				} else if (j == b && chessBoard[i][j].equals("B") && firstCheck) {
					System.out.print("C2 ");
					needChange++;
					check = true;
				} else if (chessBoard[i][j].equals("W") && check) {
					System.out.print("C3 ");
					needChange++;
					check = false;
				} else if (chessBoard[i][j].equals("B") && !check) {
					System.out.print("C4 ");
					needChange++;
					check = true;
				} else {
					System.out.print("N1 ");
				}

			}
			System.out.println();
		}

		return needChange;
	}

}

package BOJ;


import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if( a == 0 && b == 0) break;
			System.out.println(a+b);
		}
		scanner.close();
	}
}
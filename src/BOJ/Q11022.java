

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<count; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
			
		}
		scanner.close();
	}
}

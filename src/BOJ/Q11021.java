package BOJ;


import java.util.Scanner;

public class Q11021 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		
		for(int i=0; i<count; i++) {
			String[] arr = scanner.nextLine().split(" ");
			System.out.println("Case #" + (i+1) + ": " + (Integer.parseInt(arr[0])+Integer.parseInt(arr[1])));
		}
		scanner.close();
	}
}

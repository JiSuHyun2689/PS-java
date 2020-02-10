import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		if(count < 1 || count > 100) return;
		
		int sum = 0;
		String str = scanner.nextLine();
		
		for(int i=0; i<count; i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println(sum);
		scanner.close();
	}
}

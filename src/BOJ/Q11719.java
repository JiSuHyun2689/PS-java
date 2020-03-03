package BOJ;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Q11719 {
	public static void main(String[] args) {
		
		int i = 0;
		Scanner scanner = new Scanner(System.in);
				
		while(scanner.hasNextLine() && i < 100) {
			String str = scanner.nextLine();
			
			if(str.length() > 100 || !Pattern.matches("^[a-zA-Z0-9 ]*$", str)) {
				return;
			}
			
			i++;
			System.out.println(str);
		}
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q1158 {

	static List<Integer> list;
	static ListIterator<Integer> cursor;
	static StringBuilder output;
	
	public static void main(String[] args) {
		
		list = new LinkedList<>();
		cursor = list.listIterator(list.size());
		output = new StringBuilder();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String[] input = br.readLine().split(" ");
			
			int count = Integer.parseInt(input[0]);	
			int targetIdx = Integer.parseInt(input[1]);
			
			IntStream.range(1, count+1).forEach(num -> list.add(num));
			
			
			cursor.next();
			
			
			System.out.println(output);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static int josephus(int size, int targetIdx) {

		if(size == 1) {
			return 1;
		}
		int target = ((josephus(size-1, targetIdx) + targetIdx - 1) % size) + 1;
		System.out.println(target);
		output.append(list.remove(target-1));
		return target;
	}

}

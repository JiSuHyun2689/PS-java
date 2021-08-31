package algo.book1.search;

public class FindParts {

	public static int[] temp;

	public static void main(String[] args) {

		int n = 5, m = 3;
		int[] parts = { 8, 3, 7, 9, 2 };
		int[] needParts = { 5, 7, 9 };

		
		countSort(parts);
		
		printArray(needParts);
	}
	
	public static void printArray(int[] target) {
		
		for(int i=0; i<target.length; i++) {
			if(temp[target[i]] == 1)
				System.out.print("yes ");
			else
				System.out.print("no ");
		}
		
	}

	public static void countSort(int[] target) {

		temp = new int[1000001];

		for (int i = 0; i < target.length; i++) {
			temp[target[i]] += 1;
		}

	}

}

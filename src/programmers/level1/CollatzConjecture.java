package programmers.level1;

public class CollatzConjecture {
	class Solution {
		public int solution(int num) {
			
			/*
			 * for(int i =0; i<500; i++){ if(n==1) return i; n = (n%2==0) ? n/2 : n*3+1; }
			 * return -1;
			 */
			return collatz(num);
		}

		int collatz(int n) {
			int count = 0;

			while (n != 1) {
				if (n % 2 == 0)
					n = n / 2;
				else if (n % 2 == 1)
					n = (n * 3) + 1;

				count++;

				if (count > 500) {
					count = -1;
					break;
				}
			}
			return count;
		}
	}
}

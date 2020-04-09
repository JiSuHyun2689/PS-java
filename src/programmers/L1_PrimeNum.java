package programmers;

public class L1_PrimeNum {

//	class Solution {
//		public int solution(int n) {
//			int answer = 0;
//			int[] arr = new int[n + 1];
//
//			for (int i = 2; i <= n; i++)
//				arr[i] = i;
//
//			for (int i = 2; i <= n; i++) {
//				for (int j = 2; j <= n; j++) {
//					if (arr[i] % j == 0 && arr[i] != j) {
//						arr[i] = 0;
//						break;
//					}
//				}
//			}
//
//			for (int target : arr)
//				if (target != 0)
//					answer++;
//
//			return answer;
//		}
//	}
	
	

// 에라토스테네스의 체
class Solution {
	  public int solution(int n) {
	      int answer = 0;
	      int[] arr = new int[n+1];
	      
	      for(int i=2; i<=n; i++)
	          arr[i] = i;
	      
	      for(int i=2; i*i<=n; i++){             
	          if(arr[i] != 0){
	            for(int j=i*i; j<=n; j+=i){
	                arr[j] = 0;
	            }   
	          }
	      }
	      
	      for(int i=2; i<=n; i++)
	          if(arr[i] != 0)
	              answer++;
	     
	      return answer;
	  }
	}
}

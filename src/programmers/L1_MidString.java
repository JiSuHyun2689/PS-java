package programmers;

class L1_MidString {
	  public String solution(String s) {
	      String answer = "";
	      int mid = s.length()/2;
	      
	      if(s.length() % 2 == 0)
	          answer = s.split("")[mid-1] + s.split("")[mid];
	        else
	            answer = s.split("")[mid];
	                    
	      return answer;
	  }
	}
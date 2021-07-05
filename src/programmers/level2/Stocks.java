package programmers.level2;
import java.util.Stack;

public class Stocks {

	class Solution {
		public int[] solution(int[] prices) {
			int[] answer = new int[prices.length];
			Stack<Stock> stack = new Stack<>();

			for (int i = prices.length - 2; i >= 0; i--) {
				int second = 0;
				Stock stock = new Stock(prices[i], second);

				while (!stack.isEmpty() && stack.peek().price >= stock.price) {
					second += stack.pop().second;
				}
				stock.setSecond(++second);
				stack.push(stock);
				answer[i] = second;
			}
			return answer;
		}

		class Stock {
			int price;
			int second;

			public Stock(int price, int second) {
				this.price = price;
				this.second = second;
			}

			public void setSecond(int second) {
				this.second = second;
			}

			@Override
			public String toString() {
				return String.format("price : " + this.price + ", second : " + this.second);
			}
		}
	}
}

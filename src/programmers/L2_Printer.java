package programmers;

import java.util.Deque;
import java.util.LinkedList;


class L2_Printer {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		Deque<Printer> deque = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			Printer printer = new Printer(i, priorities[i]);

			if (!deque.isEmpty()) {
				Printer prePrinter = deque.peekFirst();
				System.out.println("current : " + priorities[i] + ", First === " + prePrinter.toString());
				if (prePrinter.priority >= printer.priority) {
					deque.addLast(printer);
					continue;
				}
			}
			deque.addFirst(printer);
		}
		System.out.println(deque);
		return answer;
	}

	class Printer {
		int location;
		int priority;

		public Printer(int location, int priority) {
			this.location = location;
			this.priority = priority;
		}

		@Override
		public String toString() {
			return String.format("location : " + this.location + ", priority : " + this.priority);
		}
	}
}
package algo.book1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrderOfGradesDesc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine().trim());
		ArrayList<Student> students = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String[] temp = scanner.nextLine().split(" ");
			Student input = new Student(temp[0], Integer.parseInt(temp[1]));
			students.add(input);
		}

		// 오름차순
		System.out.println("오름차순 정렬");
		Collections.sort(students);
		printList(students);

		// 내림차순
		System.out.println("\n내림차순 정렬");
		Collections.sort(students, Collections.reverseOrder());
		printList(students);

	}

	public static void printList(ArrayList<Student> list) {
		for (Student target : list)
			System.out.print(target.name + " ");
	}
}

class Student implements Comparable<Student> {
	public String name;
	public int grade;

	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(Student o) {
		if (o.grade > grade)
			return -1;
		else if (o.grade < grade)
			return 1;

		return 0;
	}
}
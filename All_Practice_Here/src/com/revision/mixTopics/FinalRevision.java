package com.revision.mixTopics;

public class FinalRevision {

	static class Result {
		String studentName;
		int[] marks;

		Result(String studentName, int[] marks) {
			this.studentName = studentName;
			this.marks = marks;
		}

		int total() {
			int sum = 0;
			for (int mark : marks) {
				sum += mark;
			}
			return sum;
		}

		double average() {
			if (marks.length == 0)
				return 0;
			return (double) total() / marks.length;
		}

		String grade() {
			double avg = average();
			if (avg >= 80)
				return "A";
			else if (avg >= 60)
				return "B";
			else if (avg >= 40)
				return "C";
			else
				return "F";
		}

		String report() {
			return studentName.trim().toUpperCase() + " | total=" + total() + " | average=" + average() + " | grade="
					+ grade();
		}
	}

	public static void main(String[] args) {

		Result[] results = { new Result("Aman", new int[] { 78, 85, 91 }),
				new Result("Riya", new int[] { 35, 42, 39 }) };

		for (Result result : results) {
			System.out.println(result.report());
		}
	}
}

package com.industryBased.studentResult;

import java.util.Scanner;

public class StudentResultManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of student: ");
		int n = sc.nextInt();

		int[] marks = new int[n];
		int totalMarks = 0;
		int passed = 0;
		int failed = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks of student " + (i + 1) + ": ");
			marks[i] = sc.nextInt();

			if (marks[i] < 0 || marks[i] > 100) {
				System.out.println("Invalid marks! Enter again. ");
				i--;
				continue;

			}
			totalMarks += marks[i];
			if (marks[i] >= 40) {
				passed++;
			} else {
				failed++;
			}
		}

		double average = (double) totalMarks / n;

		System.out.println("========== STUDENT RESULT REPORT =========");

		for (int i = 0; i < n; i++) {
			System.out.println("Student " + (i + 1) + ": " + marks[i]);

			if (marks[i] >= 40) {
				System.out.println(" - PASS");
			} else {
				System.out.println(" - FAIL");
			}
		}
		System.out.println("\nTotal Students: " + n);
		System.out.println("Passed Students: " + passed);
		System.out.println("Failed Students: " + failed);
		System.out.println("Average Marks: " + average);

		sc.close();

	}

}

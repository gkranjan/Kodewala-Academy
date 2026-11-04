package com.revision.mixTopics;

public class RactangleArea {

	static class Ractangle {
		double length, width;

		public Ractangle(double length, double width) {
			super();

			this.length = length;
			this.width = width;
		}

		double area() {
			return length * width;
		}

	}

	public static void main(String[] args) {
		Ractangle[] shapes = { new Ractangle(5, 6), new Ractangle(4, 2) };

		String heading = "rectangle areas";

		System.out.println(heading.toUpperCase());
		for (Ractangle r : shapes) {
			System.out.println(r.area());
		}
	}
}

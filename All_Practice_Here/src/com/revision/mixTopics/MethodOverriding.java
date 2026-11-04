package com.revision.mixTopics;

public class MethodOverriding {

	static class Animal {
		String sound() {
			return "some sound";
		}
	}

	static class Dog extends Animal {
		@Override
		String sound() {
			return "Bark";
		}
	}

	static class Cat extends Animal {
		@Override
		String sound() {
			return "Meow";
		}
	}

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat(), new Animal() };

		for (Animal animal : animals) {
			System.out.println(animal.sound().toUpperCase());
		}
	}

}

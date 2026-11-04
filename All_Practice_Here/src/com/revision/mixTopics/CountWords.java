package com.revision.mixTopics;

public class CountWords {

	public static void main(String[] args) {

		String sentence="Java makes coding intresting ";
		String cleaned = sentence.trim();
		int words = cleaned.isEmpty() ? 0 : cleaned.split("\\s+").length;
		
		String heading="word count";
		System.out.println(heading.toUpperCase());
		System.out.println("Words:" +words);
		
	}

}

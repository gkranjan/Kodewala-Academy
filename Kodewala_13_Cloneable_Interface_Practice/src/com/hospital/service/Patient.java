package com.hospital.service;

public class Patient implements Cloneable {

	private int patientId;
	private String patientName;
	private int age;
	private String disease;

	public Patient(int patientId, String patientName, int age, String disease) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.disease = disease;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println("Patient Id: " + patientId);
		System.out.println("Patient Name: " + patientName);
		System.out.println("Age: " + age);
		System.out.println("Disease: " + disease);

	}

}

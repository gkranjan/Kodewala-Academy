package com.hospital.model;

import com.hospital.service.Patient;

public class PatientService {
	
	public static void main(String[] args) {
		
		Patient patient=new Patient(101,"Shyam",28,"Fever");
		
		try
		{
			Patient patient1=(Patient) patient.clone();
			System.out.println("Before cloning:");
			patient.display();
			
			System.out.println("\nAfter cloning:");
			patient1.display();
			
			
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}

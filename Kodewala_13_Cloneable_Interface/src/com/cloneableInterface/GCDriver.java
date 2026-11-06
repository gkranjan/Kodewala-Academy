//package com.cloneableInterface;
//
//import com.cloning.Interface.tcsEmployee.Address;
//import com.cloning.Interface.tcsEmployee.Employee;
//
//public class GCDriver {
//	
//	Address address;
//	Employee emp1;
//	Employee clonedEmp;
//	
//	public void doSomething() throw ClonedNotSupportedException
//	{
//		
//		address= new Address("Kodewala Academy","BTM Bangalore","7845663333");
//		
//		emp1= new Employee("Kodewala Academy","BTM Bangalore","7845663333");
//
//		clonedEmp= new Employee("Kodewala Academy","BTM Bangalore","7845663333");
//		
//		clonedEmp=(Employee) emp1.clone();
//		
//		emp1.address.city="Hyd";
//		
//		System.out.println(emp1.address);
//		
//		System.out.println(clonedEmp.address.city);
//			
//		// emp1=null;  // then GC(Garbage collector) will delete the object ,automatically.
//		/**
//		 * Garbage collector will works JVM needs.then GC works and also out of space then works.
//		 * need memory and don't have. 
//		 */
//	
//	}
//	public static void main(String[] args) {
//		
//		
//	}
//
//}
//
//// ThreadDump is important. read it.
//// how to reduce the memory space.
//// workaround
//// how do we enable heapsize.
//// java OPDS
////
//

package com.revision.mixTopics;

public class LinearSearch {

	public static void main(String[] args) {

		int[] ids= {101,205,309,412,518};
		int target=309;
		int index=-1;
		
		for(int i=0;i<ids.length;i++)
		{
			if(ids[i]== target)
			{
				index =i;
				break;
			}
		}
		
		String status=index >=0 ?"found" : "not found";
		System.out.println(status.toUpperCase());
		System.out.println("Inedx:" +index);
	}

}

package com.revision.mixTopics;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] values= {2,3,2,4,3,5};
		String heading = "unique values";
		
		System.out.println(heading.toUpperCase());
		
		
		for(int i=0;i < values.length;i++)
		{
			boolean seen = false;
			
			for(int j=0;j<i;j++)
			{
				if(values[i]== values[j])
				{
					seen = true;
					break;
				}
			}
			if(!seen)
			{
				System.out.println(values[i] + " ");
			}
		}
	}

}

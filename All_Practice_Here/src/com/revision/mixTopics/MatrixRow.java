package com.revision.mixTopics;

public class MatrixRow {

	public static void main(String[] args) {

		int[] [] matrix = {
				{1,2,3},
				{4,4,6},
				{7,8,9}
		};
		
		String label = "row totals";
		System.out.println(label.toUpperCase());
		
		for(int i=0;i < matrix.length;i++)
		{
			int sum =0;
			
			for(int value : matrix[i])
			{
				sum += value;
		}
			System.out.println("Row " +(i+1)+ ": " +sum);
	}
	}

}

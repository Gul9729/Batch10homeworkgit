package com.syntax.class11;

public class TeamProject {

	public static void main(String[] args) {
		//Create a 2D array of integer values. Print the sum of all numbers
		
		int[][] array= {
				{10, 20, 30},
				{15, 25, 35},
		
		};
		int sum=0;
		for(int r=0; r<array.length;r++) {
			for(int c=0; c<array[r].length;c++) {
				sum+=array[r][c];
			}
			System.out.println(sum);
			sum=0;
		}
		

	}

}

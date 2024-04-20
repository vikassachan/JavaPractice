package com.arraypractice;

public class Array_prac2 {

	public static void main(String[] args) {

		//find minimum number in an array
		
		int arr[][]= {{2,3,4},{5,1,6},{3,4,9}};
		
		int min=arr[0][0];
		
		for(int i =0;i<3;i++)
		{
			for(int j =0; j<3; j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
		System.out.println(min);
	}

}

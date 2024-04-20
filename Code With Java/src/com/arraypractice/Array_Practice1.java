package com.arraypractice;

public class Array_Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] marr = new int [3] [2] ;
		marr[0][0]=1;
		marr[0][1]=2;
		marr[1][0]=3;
		marr[1][1]=4;
		marr[2][0]=5;
		marr[2][1]=6;
		
		//System.out.println(marr.length);
		
		for(int i=0;i<marr.length;i++)
		{
			for(int j = 0;j<marr[0].length;j++)
			{
			System.out.print(marr[i][j]);
			}
			System.out.println();
		}
		
	}

}

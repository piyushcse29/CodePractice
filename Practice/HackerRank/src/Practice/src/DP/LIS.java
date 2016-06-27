package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Longest Increasing Subsequences
public class LIS {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers you wants to take?");
		int totalnum=Integer.parseInt(br.readLine());
		int i=0,j=0;
		int num[]=new int[totalnum];
		int Li[]=new int[totalnum];
		
		 for(i=0;i<totalnum;i++)
		   Li[i]=1;
		
		System.out.println("Please Enter the string of numbers");
		
		Scanner sc=new Scanner(br.readLine());
		i=0;
		while(sc.hasNext()){
		  num[i]=sc.nextInt();
		  i++;
	    }
		
/*******************************Main Logic**********************************************/		
		for(i=1;i<totalnum;i++){
		  for(j=0;j<i;j++){
			  if(num[j]<num[i]&&Li[i]<Li[j]+1)
				  Li[i]=Li[j]+1;
		  }		
		}
/***************************************************************************************/		
		int max=0;
		
		for(i=0;i<totalnum;i++){
			if(max<Li[i])
				max=Li[i];
		}
		
	
			System.out.println(max);
	
		
	}

}

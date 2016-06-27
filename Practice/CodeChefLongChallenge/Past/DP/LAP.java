package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Longest Arithmetic Progression
public class LAP {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers you wants to take?");
		int totalnum=Integer.parseInt(br.readLine());
		int i=0,j=0,k=0;
		int num[]=new int[totalnum];
		int L[][]=new int[totalnum][totalnum];
		
		int lap=2;//Minimum value will be 2
		
		
		 for(i=0;i<totalnum;i++)
		   L[i][totalnum-1]=2;
		
		System.out.println("Please Enter the string of numbers");
		
		Scanner sc=new Scanner(br.readLine());
		i=0;
		while(sc.hasNext()){
		  num[i]=sc.nextInt();
		  i++;
	    }
		
		/*******************************Main Logic**********************************************/		
		for(j=totalnum-1;j>=1;j--){
			
			i=j-1; k=j+1;
			
			while(i>=0&&k<=totalnum-1){
				
				if(num[i]+num[k]<2*num[j]){
					k++;
				}
				else if(num[i]+num[k]>2*num[j]){
					L[i][j]=2;i--;
				}
				else{
					L[i][j]=L[j][k]+1;
					
					if(lap<L[i][j])
						lap=L[i][j];
					i--;k++;
				}
			}
		}
       /***************************************************************************************/	
		
	
			System.out.println(lap);
	
		
	}

}

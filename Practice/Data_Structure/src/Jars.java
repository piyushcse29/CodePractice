	import java.io.*;
	import java.util.Scanner;
	
	public class Jars{
	  public static void main(String args[]) throws IOException{
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      String initial=br.readLine();
	      Scanner sc=new Scanner(initial);
	      int jar=sc.nextInt();
	      int testcases=sc.nextInt();
	     
	      String cases[]=new String[testcases];
	      for(int i=0;i<testcases;i++)
	        cases[i]=br.readLine();
	      int jars[]=new int[jar];
	      int a,b,capacity;
	      for(int i=0;i<jar;i++)
	    	  jars[i]=0;
	      for(int i=0;i<testcases;i++){
	        sc=new Scanner(cases[i]);
	        a=sc.nextInt();
	        b=sc.nextInt();
	        capacity=sc.nextInt();
	        for(int j=a-1;j<=b-1;j++)
	           jars[j]=jars[j]+capacity;
	     }
	      long total=0;
	      for(int i=0;i<jar;i++)
	        total=total+jars[i];
	        System.out.println(total/jar);
	  }
	}
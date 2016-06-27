
import java.io.*;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        Scanner in1=new Scanner(System.in);
        String input=in1.nextLine();
        Scanner lex=new Scanner(input);
        lex.useDelimiter("\\s* \\s*");
                
         int dif,t1=0,t2=0,t3=0,t4=0,t5=0,start=0,temp=0;
         
         dif=1;
         
         System.out.println("dif is "+dif);
        Scanner lex2=new Scanner(input);
        lex2.useDelimiter("\\s* \\s*");
        if(lex2.hasNext())
           start=lex2.nextInt();
          while(lex2.hasNext()){
        	  temp=lex2.nextInt();
        	  if(temp!=start+dif){
        		  System.out.println("Missing number is "+(start+dif));
        	  }
        		  
        	   
        	   start=temp;
           }
        	   
        	
       
    
   // diff()
    }
}



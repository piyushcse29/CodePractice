import java.util.Scanner;

class GetInputFromUser
{/*
   public static void main(String args[])
   {
      int a;
      float b;
      String s;
 
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string");
      s = in.nextLine();
      System.out.println("You entered string "+s);
 
      System.out.println("Enter an integer");
      a = in.nextInt();
      System.out.println("You entered integer "+a);
 
      System.out.println("Enter a float");
      b = in.nextFloat();
      System.out.println("You entered float "+b);   
   }
}


import java.util.Scanner;


public class GetPrimes {
	
	
	public static void main(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(new GetPrimes().getNumberOfPrimes(Integer.parseInt(in.toString())));
		
	}
	
	int getNumberOfPrimes(int N) {
        int i=0;
		while(N%2==0){
			i++;
		    N=N/2;
		}
		
		
        for(int j=3;j<Math.sqrt(N);j=j+2)
        	while(N%i==0){
        		i++;
        	    N=N/2;
        	}	
     return i;
	}
*/
}


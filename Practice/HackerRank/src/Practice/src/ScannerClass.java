import java.util.Scanner;


public class ScannerClass {
  public static void main(String args[]){
	  String input ="1 2";
	  
	  Scanner sc=new Scanner(input);
	 
	 sc.useDelimiter("\\s* \\s*");
	 int temp[]=new int[2];
	 int i=0;
	  while(sc.hasNext()){
		  temp[i]=sc.nextInt();
		  System.out.println(temp[i]);
		  i++;
		  
		  
	  }
	  
	  
  }
}

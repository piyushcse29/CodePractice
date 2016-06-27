
/**
 *
 * @author piyush
 */
import java.io.*;

public class Stack {
    static final int MAX=2;
	static int stack[]=new int[MAX];
	static int top=-1;
	
     public static void main(String args[]) throws IOException{
                
         
               InputStreamReader is=new InputStreamReader(System.in);
               BufferedReader br1=new BufferedReader(is);
               boolean choice=true; 
               while(choice){
                System.out.println("Please enter any one operation that you want to perform on Stack\n" );
                System.out.println("1 for Push\n" );
                System.out.println("2 for Pop");
                int option = Integer.parseInt(br1.readLine());
     
                switch(option){
                    case 1: 
                         System.out.print("Now enter the elements :\n");
                         new Stack().push(Integer.parseInt(br1.readLine()));
                         break;
                    case 2: 
                        
                        System.out.println("Popped Element is :\n" );
                        new Stack().pop();
                        break;
           
                           
                 }
                 
               }
                 
              
     }
     
     
     void push(int element){
    	 if(top>=MAX-1)
    		 System.out.print("Stack Full:\n");
    	 else{         
    	 stack[++top]=element; 
    	 }
     }
  
     void pop(){
    	 if(top==-1)
    		 System.out.print("Stack Empty :\n");
    	 else{
    	 System.out.println(stack[top--]);
    	     	 }
     	 
     }
    
}

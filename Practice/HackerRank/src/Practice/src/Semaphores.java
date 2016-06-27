
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Semaphore;


public class Semaphores {

	/**
	 * @param args
	 */
	static Semaphore sm;
	static int lock=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter number of semaphores you wants to take"); 
          sm=new Semaphore(Integer.parseInt(br.readLine()));
         
         System.out.println("Please enter A to acquire lock, B to release lock and E to exit"); 
         String option;
         boolean exit=true;
         while(exit){
        	 option=br.readLine();
          switch(option){
	        case "A":acquireLock(); break;
	        case "R":releaseLock(); break;
	        case "E":exit=false; break;
          }
         } 
          
	}

	
	static void acquireLock(){
		try {
			sm.acquire();
			lock++;
			System.out.println("Lock on :"+lock);
		} catch (Exception e) {
			System.out.println("Sorry no more lock possible");
		}

	}
	
	static void releaseLock(){
		if(lock<0){
			System.out.println("No pending Lock");
			return;
		}	
		sm.release();
		System.out.println("Release Lock :"+lock);
		lock--;
	}
}


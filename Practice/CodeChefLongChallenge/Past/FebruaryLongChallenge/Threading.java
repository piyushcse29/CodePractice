package FebruaryLongChallenge;

public class Threading implements Runnable{
    Thread th;
    int count = 0;
    public Threading(String name) {
        th = new Thread(this,name);
        th.start();
        
    }
 
    public synchronized void  run() {
      //System.out.println("count " + counter.v);
        if(counter.v ==  Integer.parseInt(th.getName())){
            
            notify();
            ++counter.v;
            System.out.println("Hello " + th.getName());
         count = Integer.parseInt(th.getName());
       
        }
        else
            try {
                wait();
            } catch (InterruptedException e) {
            }         
    }
    
    public static void main(String args[]){
        for(int i = 1; i <11; i++)
        new Threading(""+i);
          
        }

    
}

    class counter{
   
    static int v = 1;
    }


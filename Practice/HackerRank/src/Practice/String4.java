package Practice;

public class String4 {
    int index = 0;
    
    
    void printS(String arr[][], int m, int n, int i, String out[], int k){
       
      if(i > m) 
         return;
             
      if(i == m){
          System.out.println();
          for(int l =0; l < out.length; l++)
          System.out.print(" "+out[l]);
         return;
      }   
 
      
      int j = 0;
       
      while(j < arr[i].length){
            out[k] = arr[i][j];
             j++;
            printS(arr, m, n, i+1,out, k+1);
       }
    }   
         
      public static void main(String args[]){
         
          String4 s= new String4();
          String arr[][]  = {{"you", "we"},
                                  {"have", "are"},
                                  {"sleep", "eat", "drink"}};
         String out[] = new String[3];
          
          s.printS(arr, 3, 3, 0,out, 0);
                                   
      }
     
}

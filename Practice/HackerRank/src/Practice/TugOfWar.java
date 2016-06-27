package Practice;

public class TugOfWar {
    
    static int arr[] = {3, 4, 5, -3, 100, 1, 89, 54, 23, 20};
    static int arr_s =0;  
    static  int diff = Integer.MAX_VALUE; 
    static int farr[];
    
    
    static void func(int s1[],int arr_sum, int start, int j){
          
           int tsum = 0;
           if(start > arr.length-1)
             return;
           if(j == arr.length/2){
               for(int i =0; i < s1.length; i++)
                   tsum += s1[i];
               
               if( (arr_sum/2) -tsum >= 0 && diff >  (arr_sum/2) -tsum){
                   for(int i =0; i < s1.length; i++)
                       farr[i] = s1[i];
                   
                     diff = (arr_sum/2) -tsum;
               }    
           return;
           }
           
            
           
            func(s1, arr_sum, start+1, j);
            s1[j] = arr[start];
            func(s1, arr_sum, start +1, j+1);
           
           
        }
    
    public static void main(String args[]){
        
            int s1[] = new int[arr.length/2];
            for(int i =0; i < s1.length; i++)
                s1[i] = 0;
                
        for(int i =0; i < arr.length; i++)
            arr_s += arr[i];
        
        farr = new int[arr.length/2];
        func(s1, arr_s, 0, 0);
        for(int i =0; i < farr.length; i++){
              System.out.print(" "+farr[i]);
            }
           
            
        }
}

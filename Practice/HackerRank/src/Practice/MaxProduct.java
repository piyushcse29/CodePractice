package Practice;

public class MaxProduct {
    static int maxprod = 0;
   
   static int func(int arr[], int start, int max){
        
        int tmax = 0;
        
        if(max == 1 || start > arr.length)
            return arr[start-1];
        
        for(int i = start; i < arr.length; i++){
           // if(arr[i] < arr[i+1])
                tmax =Math.max( arr[i] * func(arr, i+1, max -1), func(arr, i+1, max)); 
            //else
              // tmax = func(arr, i+1, max);
            }
    
        
     //   if(tmax > maxprod)
     //       maxprod = tmax;
        
        return tmax;
        
    }
    
    public static void main(String args[]){
        int arr[] = {6,7,8};//,1,2,3,9,10};
        System.out.println(func(arr, 0, 3));

    }
}

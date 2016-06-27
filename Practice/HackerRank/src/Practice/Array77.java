package Practice;

public class Array77 {
    static int maxprod = 0;
    static int maxProd[];
    static void maxProduct(int arr[], int index, int tarr[], int j, int n){
        boolean status = true;
        int prod = 1;
        if (index >= arr.length){
              return;
        }       
        
        maxProduct(arr, index+1, tarr, j, n);
       
        tarr[j] = arr[index];
        
        if(j == n-1){
            for(int i = 0; i < n; i ++){
             if(i+1 <= n-1 &&tarr[i+1] < tarr[i])
                 status = false;
             prod *= tarr[i];
            }    
        if(prod > maxprod && status){
            maxprod = prod;
            for(int i = 0; i < n; i ++)
              maxProd[i] = tarr[i];
        }   
         return;
        }
        
      //  if(index < arr.length-1 && arr[index+1] >= tarr[j])
         maxProduct(arr, index+1, tarr, j+1, n);
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 5, 10, 8, 9};
        //int arr[] = {6, 7, 8, 1, 2, 3, 9, 10};
        int n = 3;
        int tarr[] = new int[n];
        maxProd = new int[n];
         maxProduct(arr, 0, tarr, 0, n);
         for(int i = 0; i < n; i ++)
          System.out.print(" "+maxProd[i]);
   }
}

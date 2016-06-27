package Practice;

public class Array80 {
   
    static void possible(int arr[], int index, int tarr[], int j, int n){
        if (index > arr.length){
              return;
        }    
        if(j == n){
        for(int i = 0; i < n; i ++)
         System.out.print(" " +tarr[i]);
        System.out.println();
        return;
        }
        
        for(int i = index; i < arr.length; i++){
          tarr[j] = arr[i];
         possible(arr, i+1, tarr, j+1, n);
        }
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = 2;
        int tarr[] = new int[n];
        
        possible(arr, 0, tarr, 0, n);
   }
}

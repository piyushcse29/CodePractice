package Practice;

public class ArrayTemp {
   
   static void func(int arr[], int index, int count, int temp[], int k, int flag){
        if(index > arr.length || k > 3)
          return;
        
        if((k == 3|| k == 2) && flag == 1){
            if(sum(temp, k) ==true){
        for(int i = 0; i < k; i++){
              
            System.out.print(" "+temp[i]);
        }
        System.out.println();
            }
        }
 
       func(arr, index+1, count, temp, k, 0);
        
        if(k < 3 && index < arr.length)
        temp[k] = arr[index];
        
        func(arr, index+1, count+1, temp, k+1, 1);
        
         
    }
    
   static boolean sum(int arr[], int k){
       int s=0;
       for(int i = 0; i <k; i++){
          s+=arr[i];
        }
       if(s%3 == 0)
        return true;
       else 
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 2, 9};
        int temp[] = new int[3];
        func(arr, 0, 0, temp, 0, 0);
   }
}

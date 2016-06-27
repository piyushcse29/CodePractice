package Practice;

public class Array133 {   
   public static void main(String[] args) {
       int arr[] = {3,1,3};//{4, 3, 6, 2, 1, 1};
       int N = arr.length;
       for(int i = 0; i < N; i++){
          if(arr[Math.abs(arr[i])-1] > 0)
              arr[Math.abs(arr[i])-1] *= -1;
          
          else if(arr[Math.abs(arr[i])-1] < 0){
             System.out.print(Math.abs(arr[i]));
          }
          }
       
       for(int i = 0; i  < N; i++){
          if(arr[i] > 0){
            System.out.println(" " +(i+1));
           }
          
        }
   }
}

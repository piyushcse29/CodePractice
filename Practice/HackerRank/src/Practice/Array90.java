package Practice;

public class Array90 {
    static int min_diff = Integer.MAX_VALUE;
    
   static void TOW(int arr[], int count, int index, int sum, int visited[], int fvisited[], int totalsum){
       
      if((count > arr.length/2) || index >= arr.length)
          return;
       
        if(count == arr.length/2 && Math.abs(sum - totalsum/2) < min_diff){
          min_diff =Math.abs(sum - totalsum/2);
         for(int i = 0; i < arr.length; i++){
            fvisited[i] = visited[i];
           }
        }
     
      TOW(arr, count, index+1, sum, visited, fvisited, totalsum);
        sum += arr[index];
        visited[index] = 1;
      TOW(arr, count+1, index+1, sum, visited, fvisited, totalsum);
        visited[index] = 0;
    }
    
    public static void main(String args[]){
        
        int arr[] = {3, 4, 5, -3, 100, 1, 89, 54, 23, 20};
        
        int visited[] = new int[arr.length];
        int fvisited[] = new int[arr.length];
        int totalsum = 0;
        for(int i = 0; i < arr.length; i++){
            visited[i] = fvisited[i] = 0; 
            totalsum += arr[i];
        }
        
          TOW(arr, 0, 0, 0, visited, fvisited, totalsum);
          
        for(int i = 0; i < arr.length; i++){
            if(fvisited[i] == 1)
           System.out.print(" " + arr[i]); 
        }
        System.out.println();
        
        for(int i = 0; i < arr.length; i++){
            if(fvisited[i] == 0)
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}

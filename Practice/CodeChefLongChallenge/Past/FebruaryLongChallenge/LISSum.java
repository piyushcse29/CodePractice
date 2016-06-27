package FebruaryLongChallenge;

public class LISSum {
    int result[];
    static int maxCount = 0;
    static int sum = 0;
    void findLISSum(int arr[], int i, int result[], int j, int count){
        
        if(i > arr.length-1){
          
            if(maxCount < count){
                maxCount = count;
                sum = findSum(result);
            }    
           return;
        }
        findLISSum(arr, i+1, result, j, count);
        if(result[j-1] < arr[i]){
          result[j] = arr[i];
        findLISSum(arr, i+1, result, j+1, count+1);
        }
    }
    
    int findSum(int arr[]){
      int sum = 0;
      for(int i = 1; i < arr.length; i ++ ){
         sum += arr[i];
      System.out.print(" "+arr[i]);
      }
      System.out.println();
      return sum;
    }
    
    public static void main(String args[]){
        
        int arr[] ={1,8,2,3};
        int result[] = new int[arr.length+1];
        result[0] = Integer.MIN_VALUE;
        new LISSum().findLISSum(arr, 0, result, 1, 0);
        System.out.println("Maximum sum is "+sum);
    }
}

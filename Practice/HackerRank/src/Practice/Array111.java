package Practice;

import java.util.Arrays;

class Array111{
    
    void findGivenDiff(int arr[], int sum){
        Arrays.sort(arr);
        int i = 0, j = arr.length-1;
        int tsum = 0;
        while(i < j){
            tsum = Math.abs(arr[i] - arr[j]);
            if(tsum == sum){
             System.out.println("Exist");
             return;
           } 
            else if(tsum > sum)
               j--;
            else if(tsum < sum)
              i++;
        }
       System.out.println("Not found"); 
    }
 
 public static void main(String args[]){
     int arr[] ={90, 70, 20, 80, 50};
     new Array111().findGivenDiff(arr, 50);
 }
} 

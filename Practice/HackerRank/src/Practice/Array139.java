package Practice;

import java.math.BigInteger;

class Array139{
    static int count = 0;
    
static int count(int arr[], int start, int end, int num ){
    if(start > end)
      return -1;
    
    int mid = (start + end)/2;
    
    if(arr[mid] == num){
        int i = mid - 1;
        int j = mid +1;
        
        while( i >= 0 && arr[i] == num){
            count++;
            i--;
        }
        
        while(j < arr.length && arr[j] == num){
                count++;
                j++;
         }
        count++;
    }
    else{
       count(arr, start, mid - 1, num);
       count(arr, mid +1, end, num); 
    }
    return count ;
 }
 
 public static void main(String args[]){
     int arr[] = {1, 1, 2, 2, 2, 2, 3};
    
     System.out.println(count(arr, 0, arr.length-1, 2));
 }
} 

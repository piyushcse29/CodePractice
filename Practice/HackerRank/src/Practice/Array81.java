package Practice;

import java.util.Arrays;

class Array81{
    
    void findPeak(int arr[], int start, int end){
        if(arr == null)
         return;
        if(start == end){
        System.out.println("Peak Element is "+arr[start]);
        return;
        }
        if(start > end){
        return;
        }
        int mid = (start + end)/2;
        if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid +1]){
            System.out.println("Peak Element is "+arr[mid]);
            return;
        }   
        findPeak(arr, start, mid-1);
        findPeak(arr, mid + 1, end);
    }
 
 public static void main(String args[]){
     int arr[] ={10, 20, 15, 2, 23, 90, 67};
     new Array81().findPeak(arr, 0, arr.length-1);
 }
} 

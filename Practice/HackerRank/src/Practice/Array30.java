package Practice;

import java.util.Arrays;

class Array30{
    
    void sortWave(int arr[]){
     
        for(int i = 1; i < arr.length-2; i+=2){
           if(arr[i-1] < arr[i])
             swap(arr, i, i-1);
            else if(arr[i+1] < arr[i])
              swap(arr, i, i+1);
        }  
    }
    
    void swap(int arr[], int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
 
 public static void main(String args[]){
     int arr[] ={20, 10, 8, 6, 4, 2};
     new Array30().sortWave(arr);
     
     for(int i = 0; i < arr.length; i++)
      System.out.print(" "+arr[i]);
 }
} 

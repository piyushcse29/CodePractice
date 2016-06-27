package Practice;

class Array123{
    
    
static void findSubset(int arr[], int maxsum, int sum){
   
   int j = 0;
   int i = 0;
   while(i <= arr.length){
       if(i < arr.length && sum < maxsum){
        sum += arr[i];   
        i++;
        }
       else if(sum == maxsum){
         System.out.println("subset index range values are " + j+" "+(i-1) );
         return;
       }
       else {
           while(sum > maxsum){
              sum -=arr[j];
               j++;
            }
        }
    }
   System.out.println("Not Found");
 }
 
 public static void main(String args[]){
     int arr[] = {1, 4};
     findSubset(arr, 0, 0);
     
 }
} 

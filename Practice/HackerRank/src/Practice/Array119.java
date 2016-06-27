package Practice;

class Array119{
    
    
static void smallestPositive(int arr[]){

int j = 0;

 for(int i = 0; i < arr.length; i++){ 
    if(arr[i] < 0){
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
      j++;
    }     
  }
for(int i = 0; i < arr.length; i++){ 
    System.out.print(arr[i]);
    }     
  
  for(int i = j; i < arr.length; i++){
      arr[j+arr[i]] = -arr[j+arr[i]]; 
   }

  for(int i = j; i < arr.length; i++){
      if(arr[i] > 0){
        System.out.println(i-j);
        break;
      }
  }
 }
 
 public static void main(String args[]){
     int arr[] = {0, 10, 2, -10, -20};
     smallestPositive(arr);
     
 }
} 

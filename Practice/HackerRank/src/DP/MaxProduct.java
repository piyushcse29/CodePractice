package DP;

public class MaxProduct {
    int N;
 //   int max = 0;
    int max1 = 0 ;
    MaxProduct(){
      N = 5;
      
    }
   public static void main(String[] args) {
      
      System.out.println(new MaxProduct().maxProduct(1));
   }
   
   int maxProduct(int i){
      int max = 0; 
     if(i >= N)
     return max;
     max = i *(N - i);
     max1 = maxProduct(i+1);
     
     if (max < max1)
         max = max1;
      return max;
     
    }
}

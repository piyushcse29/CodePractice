package Practice;

public class ArrayNew1 {
    static void gutil(int A[], int B[], char flag, int value, int temp[],int index){
      int i = 1;
      System.out.println("hello");
    if(flag == 'a'){
        while(A[i] > value){
           i++;
            break;
        }
       temp[index] = A[i];
       gutil(A, B, 'b', temp[index], temp, index+1) ;
    }
        i = -1;
        if(flag == 'b'){
            while(B[i] > value){
            i++;
                break;
            }
                
            temp[index] = B[i];
            for(int k = 0; k < temp.length; k++){
                System.out.print(temp[k]+" ");
            }   
            gutil(A, B, 'a',  temp[index], temp, index+1);
         }
    }

  public static void main(String[] args) {
       int A[] = {10, 15, 25};
      int  B[] = {1, 5, 20, 30} ;
      int temp[] = new int[A.length+B.length]; 
       gutil(A, B, 'a',  0 , temp, 0);
   }
}

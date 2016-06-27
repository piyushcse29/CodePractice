package Practice;
//Find the Increasing subsequence of length three with maximum product
public class MaxArrProd {
    static void maxProduct(int arr[], int j, int count, int prod[], int k){
        int product = 1;
        if(count == 4){
            for(int i =0; i <3; i++){
               product *= prod[i];
                System.out.print("- "+prod[i] );
            }
                   System.out.println("Product is "+product);
                   return;
        }
                   for(int i = j; i < arr.length; i++){
                     prod[k] =arr[i];
                     maxProduct(arr, j+1, count+1, prod, k+1);
                    }
        }
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 1, 2, 3, 9, 10};
        int prod[] = new int[3];
        maxProduct(arr, 0, 1, prod, 0);
   }
}

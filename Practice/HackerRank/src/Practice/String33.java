package Practice;

public class String33 {
    void decoding(int arr[], int index, char oarr[], int j){
           
        if(index >= arr.length){
            for(int i = 0; i < j; i++){
               System.out.print(" " + oarr[i]);
            }
            System.out.println();
          return;  
        }
       
        oarr[j] = (char) ('A' + arr[index] -1);
        
        decoding(arr, index + 1, oarr, j+1);
        
        if(index + 1 < arr.length && arr[index] < 3 && arr[index + 1] <=6){
             oarr[j] = (char) (arr[index] * 10 + arr[index + 1] + 'A' - 1);
          decoding(arr, index + 2, oarr, j+1);
        }  
        
        }
    
    public static void main(String args[]){
       String33 st = new String33();
       int arr[] = {1,2,3,4};
       char oarr[] = new char[arr.length];
       
       st.decoding(arr, 0, oarr, 0);

        }

   
}

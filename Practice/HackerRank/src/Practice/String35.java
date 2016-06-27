package Practice;

public class String35 {
    
    void decoding(int iarr[], int index, char oarr[], int j, String arr[]){
           
        if(index == iarr.length){
            for(int i = 0; i < j; i++){
               System.out.print(" " + oarr[i]);
            }
            System.out.println();
          return;  
        }
       
        for(int i =0; i < arr[iarr[index]].length(); i++){
          oarr[j] = arr[iarr[index]].charAt(i);
            decoding(iarr, index +1, oarr, j+1, arr);
        }
    }
    
    public static void main(String args[]){
       String35 st = new String35();
       String arr[] = {"", "","abc", "def", "ghi", "jkl",
                               "mno", "pqrs", "tuv", "wxyz"};
       int iarr[] = {2,3,4,8,9};
       char oarr[] = new char[arr.length*arr.length];
       
       st.decoding(iarr, 0, oarr, 0, arr);

     }
}

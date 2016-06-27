package Practice;

public class Array15 {
   
    void checkSum(int arr[], int sum){
        int peakIndex = 0;
        int N = arr.length;
        for(int i = 0; i < N-1; i++){
            if(arr[i] > arr[i+1]){
              peakIndex = i + 1;
              break;
            }
        }   
            int i = peakIndex;
            int j = peakIndex -1;
            while(i !=j ){
                if((arr[i] + arr[j]) == sum){
                 System.out.println("Sum found");
                  return;
                }
                else if((arr[i] + arr[j]) > sum)
                    j = (j +N -1)%N;
                    
                else if ((arr[i] + arr[j]) < sum)
                   i = (i +N+1)%N;
             }
            System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        new Array15().checkSum(arr, sum);
   }
}

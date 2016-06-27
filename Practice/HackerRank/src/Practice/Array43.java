package Practice;

class Arrays{
  int i;
  int j;
  int element;
}
public class Array43 {
    public static void main(String[] args) {
       int A[][]  =  {{2, 6, 12, 34},
                     {1, 9, 20, 1000},
                     {23, 34, 90, 2000}};
       
       int rows = A.length;      
       int col = A[0].length;
       Arrays a[] = new Arrays[rows];
       for(int i = 0; i <rows; i ++){
           a[i] = new Arrays();
         a[i].element = A[i][0]; 
         a[i].i = i;
         a[i].j = 1;
       }
       heapify(a, rows);
       
       for(int i = 0; i < rows*col; i++){
             Arrays root = a[0];           
          System.out.print(root.element + " ");
           if(root.j < col){
               root.element = A[root.i][root.j];
               root.j += 1;
           }
           else
            root.element = Integer.MAX_VALUE;     
            maxHeap(a, 0, rows);
       }
   }
    
    static void heapsort(Arrays A[], int N){
         heapify(A, N);
         for(int i = N; i > 0; i --){
             swap(A, 0, i);
             N--;
             maxHeap(A, 0, N);
          }
    }
    
    static void heapify(Arrays A[], int N){
        for(int i = N/2; i >=0; i--)
          maxHeap(A, i , N);
    }
    
    static void maxHeap(Arrays A[], int i, int N){
        
        int left = 2*i +1;
        int right = 2*i + 2;
        
        int min = i;
        
        if(left < N && A[min].element > A[left].element)
          min = left;
        if(right < N && A[min].element > A[right].element)
          min = right;
        
        if(min != i){
         swap(A, i, min);
         maxHeap(A, min, N);
        }
    }
    
    static void swap(Arrays A[], int i, int j){
        if(i == j)
          return;
        Arrays temp = A[i];
        A[i] = A[j];
        A[j] = temp; 
    }
}

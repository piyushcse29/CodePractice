import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sortings {
	static int size;
	public static void main(String args[]) throws IOException{

	 System.out.println("Please enter the number of elements that you want to take \n");
	 InputStreamReader is=new InputStreamReader(System.in);
     BufferedReader br1=new BufferedReader(is);
     size = Integer.parseInt(br1.readLine());

     System.out.print("Now enter the elements\n");
     
      int A[]=new int[size+1];
      int temp[]=new int[100];
      for(int i=0;i<size;i++){
        A[i]=Integer.parseInt(br1.readLine());
 	  }
 	  
 	 
 	 
 	    System.out.println("Press 1 for Merge Sort\n" );
 	    System.out.println("Press 2 for Quick Sort\n" );
 	    System.out.println("Press 3 for Heap Sort\n" );
	    
        int option = Integer.parseInt(br1.readLine()); 
 	 
 	 switch(option){
          case 1: 
          System.out.println("After Merge Sorting\n" );
          new Sortings().traverse(new Sortings().mergeSort(A,0,size-1));
          break;
          
          case 2: 
          System.out.println("After Quick Sorting\n" );
          new Sortings().traverse(new Sortings().quickSort(A,0,size-1));
          break;
          
          case 3: 
              System.out.println("After Heap Sorting\n" );
              new Sortings().traverse(new Sortings().quickSort(A,0,size-1));
              break;
      }
 	 
	}
 	 
 	 int[] mergeSort(int A[],int left, int right ){
 		 
 		   int mid;
 		   if(left<right){
 		   mid=(left+right)/2;
 		   mergeSort(A, left, mid);
 		   mergeSort(A, mid+1, right);
 		   merge(A, left,mid,right);
 		   }
 		  
     return A;
 	 }
  
 	 void merge(int A[], int left, int mid, int right){
 		  int n1, n2, i, j, k;
 		  n1=mid-left+1;
 		  n2=right-mid;
 	 
 		  int Left[]=new int[n1+1];
 		  int Right[]=new int[n2+1];
 		  
 		  for(i=0;i<n1;i++)
 			  Left[i]=A[left+i];
 		  for(j=0;j<n2;j++)
			  Right[j]=A[mid+j+1];
 		  
 		  Left[n1]=999;
 		  Right[n2]=999;
 		  
 		  i=0;
 		  j=0;
 			  
 		 for(k=left;k<right+1;k++)
 			  if (Left[i]<=Right[j]){
			     A[k]=Left[i];
 		         i++;
 			  }
 			  else{
 	           A[k]=Right[j]; 
 	           j++;
 			  }
 	 }	 
 	 
 	 
 	 int[] quickSort(int A[], int low, int high){
 		 int pivot;
 		 
 		 if(low<high){
 		    pivot=partition(A, low, high);
 			quickSort(A, low, pivot-1);
 			quickSort(A, pivot+1, high);
 		 }
       return A; 
 	 }

 	 int partition(int A[],int low, int high){
 		   int pivot = A[high];
 		    int i = (low - 1);
 		 
 		    for (int j = low; j <= high- 1; j++)
 		    {
 		        if (A[j] <= pivot)
 		        {
 		            i++;
 		            swap (A,i,j);
 		        }
 		    }
 		   System.out.println();
 		    swap (A,i + 1,high);
 		   System.out.println();
 		    return (i + 1);
 		    
 		
 	 }
 	 
    void swap(int A[],int a, int b){
    	System.out.println("a is :"+A[a]+"b is "+A[b]);
    	int temp=A[a];
    	A[a]=A[b];
    	A[b]=temp;
    }
 	 
 	 void traverse(int A[]){
 		for(int i=0;i<size;i++){
 	 		System.out.println(A[i]);
 	  	  }
 	 }
}



/*
 * This program finds all the triplet A[i], A[j] and A[k] such that i<j<k 
 * and A[i] > A[j] > A[k] in array A.
 */
public class Triplet {
	
	/*This function takes index of array i,j,k such that i<j<k*/
	void findTriplet(int A[],int i,int j,int k){
		if(i==j||j==k) //if index i has incremented till jth position or k has decremented till jth position
			return;
		if(A[i]>A[j]&&A[j]>A[k]) //Condition A[i] > A[j] > A[k] and i<j<k is satisfied.
			System.out.println("Elements are : "+A[i]+" "+A[j]+" "+A[k]);
		findTriplet(A,i,j,k-1);//Fixing the value of i and iterating k till its value greater then j
		findTriplet(A,i+1,j,k);//Fixing the value of k and iterating i till its value less then j
	}

	/* Driver method */
	public static void main(String args[]){
		
		int A[]=new int[]{3,2,1,4,6,7};//Input Random Array
		int length=A.length;
		for(int j=1;j<length-1;j++)//Taking fix value of j
		new Triplet().findTriplet(A,0,j,length-1);
		
	}
}

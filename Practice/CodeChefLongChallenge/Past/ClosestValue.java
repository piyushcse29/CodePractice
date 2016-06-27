/*
 * This program finds the closest element of given value in the array.
 */
public class ClosestValue {

	static int flag=0; //flag to stop further execution ones we find the element
	
	 /*
	  *This method will find the closest start and end index where element can
	  *be possible based on binary search. After finding the start and end index it 
	  *calls logic function. 
	  */ 
	void findClosest(int input[],int start,int end,int value){
		
		if (start==end)
			return;
		
		int mid=start+(end-start)/2;
		if(value<=input[mid])
		{
			findClosest(input,start,mid,value);
		     logic(input,mid,end,value);
		}     
		else
		{
			findClosest(input,mid+1,end,value);
		      logic(input,mid,end,value);
		}      
	}
	
	/* This method will find the exact element which is closest to given value.*/ 
	void logic(int input[],int start,int end,int value){
		
		if(flag==0)
	    {
	    	   if(((value-input[start])>(input[end]-value))){
   		          System.out.println(input[end]);
	              flag=1;
   	     } 
   	     else{
   		        System.out.println(input[start]);
	            flag=1;
   	     }
           } 
	}
	
	/* Driver method */
	public static void main(String args[]){
		
		int input[]=new int[]{10,20,30,40,50,60,70,80,90};//Input Array
		int length=input.length;
		
		int value=11;//Value to be searched
		
		if(value<input[0]||value>input[length-1]) //checking if value is out of range of given array
			System.out.println("Value is outside range");
		new ClosestValue().findClosest(input,0,length-1,value);
		
	}

}

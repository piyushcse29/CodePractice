package DP;

public class MinCostPath {
	static int matrix[][]={{1,2,3},
	                       {4,8,2},
	                       {1,5,3}
	                      };
  static int cost =0;
  static int minCostPath(int m,int n){
	  System.out.println(""+m+""+n);
	 if(m<0||n<0)
	   return Integer.MAX_VALUE;
	 if(m==0&&n==0)
		 return matrix[m][n];
		   
		   cost=Math.min(Math.min(minCostPath(m-1,n),minCostPath(m,n-1)),minCostPath(m-1,n-1))+matrix[m][n];
       return cost;
   }
	public static void main(String args[]){
		System.out.println(minCostPath(2,1));
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class NQueen{
	static int maxQueens=0;
	static int matrix[][];
	public static void main(String args[]) throws NumberFormatException, IOException{
     
		System.out.println("Enter the number of queens that you want to place");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		maxQueens=Integer.parseInt(br.readLine());
	
		matrix=new int[maxQueens][maxQueens];
		
		for(int i=0;i<maxQueens;i++){
			for(int j=0;j<maxQueens;j++){
				matrix[i][j]=0;
				}
		}
		NQueen(0);
		printStack();
		
    }
	static boolean NQueen(int row){
		
		if(row==maxQueens){
		//	printStack();
		 return true;
		}	
		
		for(int col=0;col<maxQueens;col++){
			if(correctPosition(row,col)==true){
				matrix[row][col]=1;
			    if(NQueen(row+1)==true)
				  return true;
				matrix[row][col]=0;
			}
		}
		return false;
    }
	
	
	static boolean correctPosition(int row, int col){
		int i,j;
		
		//Upper Rows
		//System.out.println("Row "+row+"Col "+col);
		for(i=row-1;i>=0;i--){
		  if(matrix[i][col]==1)
			  return false;
		}
	
		/* Check upper diagonal on left side */
	    for (i = row,j = col; i >= 0 && j >= 0; i--, j--)
	    {
	        if (matrix[i][j]==1)
	            return false;
	    }
	 
	    /* Check upper diagonal on  right side */
	    for (i = row, j = col; i >= 0 && j < maxQueens; i--, j++)
	    {
	        if (matrix[i][j]==1)
	            return false;
	    }
	return true;
	}

	
	static void printStack(){
		for(int i=0;i<maxQueens;i++){
			for(int j=0;j<maxQueens;j++){
				System.out.print(matrix[i][j]);
				}
			System.out.println();
		}
	}
	
	}

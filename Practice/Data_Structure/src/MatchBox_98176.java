
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatchBox_98176 {
 
// Utility functions to get maximum and minimum of two intgers
int max(int a, int b)  {    return a > b ? a : b;  }
int min(int a, int b)  {    return a < b ? a : b;  }
 
// Returns optimal value possible that a player can collect from
// an array of coins of size n. Note than n must be even
int optimalStrategyOfGame(int arr[], int n)
{
    // Create a table to store solutions of subproblems
    int table[][]=new int[n][n];
    		int gap, i, j, x, y, z;
 
    // Fill table using above recursive formula. Note that the table
    // is filled in diagonal fashion (similar to http://goo.gl/PQqoS),
    // from diagonal elements to table[0][n-1] which is the result.
    for (gap = 0; gap < n; ++gap)
    {
        for (i = 0, j = gap; j < n; ++i, ++j)
        {
            // Here x is value of F(i+2, j), y is F(i+1, j-1) and
            // z is F(i, j-2) in above recursive formula
            x = ((i+2) <= j) ? table[i+2][j] : 0;
            y = ((i+1) <= (j-1)) ? table[i+1][j-1] : 0;
            z = (i <= (j-2))? table[i][j-2]: 0;
 
            table[i][j] = max(arr[i] + min(x, y), arr[j] + min(y, z));
        }
    }
 
    return table[0][n-1];
}
 
// Driver program to test above function
public static void main(String args[]) throws IOException
{
  // try{
	String line = null;
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    FileReader filein = new FileReader(args[0]);
	FileWriter fileout = new FileWriter(args[1]);
	
        BufferedReader bufferedReader = new BufferedReader(filein);
        BufferedWriter bufferedWriter = new BufferedWriter(fileout);
        
        int options[]=new int[10000];
        int i=0;
       while((line = bufferedReader.readLine()) != null) {
        	//System.out.println(line.toString());
        	String arr[]=line.toString().split("\\s+");
        	if(Integer.parseInt(arr[0])==0)
        		break;
        	int input[]=new int[Integer.parseInt(arr[0])];
        	
        	for(i=1;i<Integer.parseInt(arr[0])+1;i++){
        		input[i-1]=Integer.parseInt(arr[i]);
        	}
        	bufferedWriter.write(""+new MatchBox_98176().optimalStrategyOfGame(input,Integer.parseInt(arr[0])));
        	bufferedWriter.newLine();
        }
        
        bufferedReader.close();
        bufferedWriter.close();
        filein.close();
        fileout.close();
        
   //}catch(Exception e){System.out.println(e);}    
 }
}
    
    
 
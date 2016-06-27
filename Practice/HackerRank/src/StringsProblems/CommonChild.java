package StringsProblems;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonChild {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        
        int matrix[][] = new int[str1.length()+1][str2.length()+1];
        String mark[][] = new String[str1.length()][str2.length()];
        
        for(int i = 0; i <= str1.length(); i++ )
            matrix[i][0] = 0;
        for(int i = 0; i <= str2.length(); i++ )
            matrix[0][i] = 0;
        
    for(int i = 0; i < str1.length(); i++){
            for(int j = 0; j < str2.length(); j++ ){
                        mark[i][j] = "";
    }}
        for(int i = 1; i <= str1.length(); i++){
            for(int j = 1; j <= str2.length(); j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                    mark[i-1][j-1] = "dia";
                }
                else if(matrix[i-1][j] <= matrix[i][j-1]){
                       matrix[i][j] = matrix[i][j-1];
                       mark[i-1][j-1] = "u";
                }
                else{
                    matrix[i][j] = matrix[i-1][j];
                    mark[i-1][j-1] = "d";
                }
            }
        }
       
        
        
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int count = 0; 
        while(i != -1 && j != -1){
           // System.out.println("i and j are " + i +" "+ j);
            if(mark[i][j] == "dia"){
               count++;
               //  System.out.print(str1.charAt(i));
               i--; j--;
             }   
            else if(mark[i][j] == "u"){
                j--;
                
            }    
            else{ 
               i--;
            }    
        }
       System.out.println(count);
    }
}
package StringsProblems;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PallindromIndex {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testcases = Integer.parseInt(br.readLine());
        
        String cases[] = new String[testcases];
        for(int i = 0; i < testcases; i++){
             cases[i] = br.readLine();
        }
        
        for(int i = 0; i < testcases; i++){
             if(checkPallindrom(cases[i], -1) == -1)
                 System.out.println("-1");
             else
                 for(int j =0; j < cases[i].length(); j++){
                     if(checkPallindrom(cases[i], j) == -1){
                         System.out.println(j);
                         break;
                     }   
                 }
        }
    }
    
       static int checkPallindrom(String str, int index){
           int i = 0, j = str.length() -1;
           while(i != j){
               if(i == index)
                   i++;
               else if(j == index)
                   j--;
               else if(str.charAt(i) != str.charAt(j)){
                     return -2;
               }
               else if(str.charAt(i) == str.charAt(j) && (j -1 == 1)){
                     return -1;
               }
               else if(str.charAt(i) == str.charAt(j)){
                     i++;
                     j--;
               }
           
           }
           return -1;
       }
}

package StringsProblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MorganString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        String cases[][] = new String[testcases][2];
        for(int i = 0; i < testcases; i++){
           cases[i][0] = br.readLine();
           cases[i][1] = br.readLine();
        }
        String finalstr = null;
        char temp[];
        int j, k, l;
        int totallength = 0;
        for(int i = 0; i < testcases; i++){
            totallength = cases[i][0].length() + cases[i][1].length();
           temp = new char[totallength];
            j = 0;
            k = 0;
            l = 0;
            while(l < totallength ){
               if(j < cases[i][0].length() && k < cases[i][1].length() && cases[i][0].charAt(j) <= cases[i][1].charAt(k)){
                  temp[l] = cases[i][0].charAt(j);
                  l++;
                  j++;
               } 
               else if(k < cases[i][1].length()){
                    temp[l] = cases[i][1].charAt(k);
                    l++;
                    k++;
                        
               }
            }  
            
            for(j = 0; j < totallength; j++ ){
               System.out.print(temp[j]);
        
        }
            System.out.println();
      }
 }
}

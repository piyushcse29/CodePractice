package StringsProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class BiggerIsGreater {
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        
        String cases[] = new String[testcases];
        for(int i = 0; i < testcases; i++){
            cases[i] = br.readLine();
        }
        char arr1[];
        char arr2[];
        int j = 0; 
        for(int l = 0; l < testcases; l++){
            j = cases[l].length()-1;
           while(j >= 1 && cases[l].charAt(j-1) >= cases[l].charAt(j))
               j--;
            arr1 = new char[j];
            arr2 = new char[cases[l].length() - j];
            
            for(int i = 0; i < j; i++)
                arr1[i] = cases[l].charAt(i);
            int k = j;
            for(int i = 0; i < cases[l].length() - j; i++, k++)
                arr2[i] = cases[l].charAt(k);
            
            if(arr1.length == 0 || arr2.length== 0){
                System.out.println("no answer");
                
            }
            else{
            Arrays.sort(arr2);
            k = 0;
            while(k < arr2.length && j > -1 && arr1[j-1] > arr2[k])
                k++;
            
            char temp = arr1[j-1];
            arr1[j-1] = arr2[k];
            arr2[k] = temp;
            
            Arrays.sort(arr2);
            
            char arr3[] = new char[cases[l].length()];
            int i = 0;
            System.out.println("lengths "+ arr1.length+ " " + arr2.length);
            for(i = 0; i < arr1.length; i++)
                arr3[i] = arr1[i];
            for(int m = 0; m < arr2.length; m++)
                arr3[i+m] = arr2[m];
            for(int m = 0; m < arr3.length; m++)
                System.out.print(arr3[m]);
            System.out.println();
            }    
        }
        
    }
}
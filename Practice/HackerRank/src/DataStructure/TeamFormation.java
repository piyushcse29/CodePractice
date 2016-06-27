package DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TeamFormation {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        int arr[];
        int elements = 0;
        Scanner sc = null;
        int min;
        int result[] = new int[testcases]; 
        for(int i = 0; i < testcases; i++){
            sc = new Scanner(br.readLine());
            sc.useDelimiter("\\s* \\s*");
            elements = sc.nextInt();
            if(elements == 1){
                result[i] = 1;
            }
            else if(elements == 0){
                result[i] = 0;
            }
            else{
            arr = new int[elements]; 
            int j = 0;
            while(sc.hasNext()){
               arr[j] = sc.nextInt();
               j++;
            }
            Arrays.sort(arr);
            int count = 0;
            int count1 = 10000000;
                   min = 10000000;
            for(j = 0; j < elements;){
                 
                if((j + 1 < elements) && arr[j+1] == (arr[j] + 1)){
                         count = 0;
                         while((j + 1 < elements) && arr[j+1] == (arr[j] + 1)){
                             count++;
                             ++j;
                          }
                }
                else if((j -1 > 0) && (j + 1 < elements) && arr[j+1] != (arr[j] + 1) && arr[j-1] != (arr[j] - 1)){
                     count1 = 1;
                    ++j;
                } 
                else if(j == 0 && arr[0] != arr[1]){
                    count1 = 1;
                    ++j;
                }
                else if(j == elements-1 && arr[j] != arr[j-1]+1){
                    count1 = 1;
                    ++j;
                }
                    
                else
                    ++j;
                if(count + 1  < min)
                    min = count + 1;
            }
            if(count1 < min)
                result[i] = count1;
            else 
                result[i] = min;
            }      
        }
        for(int j = 0; j < testcases; j++)
            System.out.println(result[j]);
    }
}
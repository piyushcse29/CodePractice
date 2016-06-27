package StringsProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        int length = 0, count1 = 0, count2 = 0;
        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
        
            
        String cases[] = new String[testcases]; 
        int count = 0;
        for(int i = 0; i < testcases; i++){
            cases[i] = br.readLine();
        }
        
        for(int i = 0; i < testcases; i++){
            if(cases[i].length() % 2 != 0){
                System.out.println("-1");
                continue;
            }
            else{
                length = cases[i].length()/2;
              
                for(int j =0; j < length; j++){
                      count1 = 0; count2 = 0;
                    if(hm1.get(cases[i].charAt(j)) != null)
                         count1 = hm1.get(cases[i].charAt(j));
                         hm1.put(cases[i].charAt(j), count1+1);
                    if(hm2.get(cases[i].charAt(j + length)) != null)
                         count2 = hm2.get(cases[i].charAt(j + length));
                         hm2.put(cases[i].charAt(j + length), count2+1);
                }
                
               
                        
            }
            
            System.out.println(hm1);
            System.out.println(hm2);
            
                Set set = hm1.keySet();
                Iterator it = set.iterator();
                char temp = '\0';
                while(it.hasNext()){
                    temp = (Character)it.next();
                  if(!hm2.containsKey(temp))
                    count = count + hm1.get(temp);
                  else {
                      if(hm1.get(temp) > hm2.get(temp))
                        count = count + hm1.get(temp) - hm2.get(temp);
                  }
                }
             System.out.println(count);
            }
            
        }
        
    
} 
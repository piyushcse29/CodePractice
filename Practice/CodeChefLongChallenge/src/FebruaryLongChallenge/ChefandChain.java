package FebruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandChain {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        String cases[] = new String[testcases];
        for(int i = 0; i < testcases; i++){
           cases[i] = br.readLine();
        }
            int j = 0;
            int count1;
            int count2;
            
            for(int i = 0; i < testcases; i++){
                count1 = 0;
                count2 = 0;
                j = 0;
                if(cases[i].length() % 2 == 0){
                  while(j < cases[i].length()-1){
                    if(cases[i].charAt(j) != '+'){
                     count1++;
                    }
                    if(cases[i].charAt(j+1) != '-'){
                       count1++;
                    }  
                    j = j + 2;
                  } 
                    j = 0;
                    while(j < cases[i].length()-1){
                      if(cases[i].charAt(j) != '-'){
                       count2++;
                      }
                      if(cases[i].charAt(j+1) != '+'){
                         count2++;
                      }  
                      j = j + 2;
                    }
                    if(count1 <= count2)
                      System.out.println(count1);
                    else 
                      System.out.println(count2);
                    
                }
                else{
                    while(j < cases[i].length()-2){
                      if(cases[i].charAt(j) != '+'){
                       count1++;
                      }
                      if(cases[i].charAt(j+1) != '-'){
                         count1++;
                      }  
                      j = j + 2;
                    }
                      if(cases[i].charAt(cases[i].length()-1) != '+' )
                          count1++;
                      
                      j = 0;
                      while(j < cases[i].length()-2){
                        if(cases[i].charAt(j) != '-'){
                         count2++;
                        }
                        if(cases[i].charAt(j+1) != '+'){
                           count2++;
                        }  
                        j = j + 2;
                      }
                      if(cases[i].charAt(cases[i].length()-1) != '-' )
                        count2++;
                    
                      if(count1 <= count2)
                        System.out.println(count1);
                      else 
                        System.out.println(count2);
                
                }
             
            }
    }   
}

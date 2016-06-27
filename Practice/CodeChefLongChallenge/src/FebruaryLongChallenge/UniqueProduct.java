package FebruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueProduct {
    public static void main(String[] args) {
       int l = 0, m = 0, n = 0;
        for(int i = 1234567; i < 9876543; i++){
            l = i/10000;
            m = ((i-((i/100000)*100000))/100);
            n = (i-((i/1000)*1000));
            int ltemp = l;
            HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
               if(hm.get(l/100) == null)
                   hm.put(l/100, 1);
                else 
                   continue;
                if(hm.get( ((l - ((l/100)*100))/10)) == null)
                    hm.put( ((l - ((l/100)*100))/10), 1);
                 else 
                    continue;
                if(hm.get(l%10) == null)
                    hm.put(l%10, 1);
                 else 
                    continue;
                if(hm.get( ((m - ((m/100)*100))/10)) == null)
                    hm.put( ((m - ((m/100)*100))/10), 1);
                 else 
                    continue;
                if(hm.get(m%10) == null)
                    hm.put(m%10, 1);
                 else 
                    continue;
                if(hm.get( ((n - ((n/100)*100))/10)) == null)
                    hm.put( ((n - ((n/100)*100))/10), 1);
                 else 
                    continue;
                if(hm.get(n%10) == null)
                    hm.put(n%10, 1);
                 else 
                    continue;
             
                                       l =  ((l/100)  * ((l -((l/100)*100))/10)  * (l-((l/10)*10)));
                                       m = ((m/100) * ((m -((m/100)*100))/10) * (m-((m/10)*10)));
                                       n = ((n/100)  * ((n -((n/100)*100))/10) * (n-((n/10)*10)));
                                       if(l !=0 && l == m) {
                                           if(m !=0 && m == n){
                                            System.out.println(l%10);
                                            break;
                                           } 
                                       }  
         }
        }
}
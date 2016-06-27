package FebruaryLongChallenge;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class ChefandEquality {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        String cases[] = new String[testcases];
        int piles[] = new int[testcases];
        for(int i = 0; i < testcases; i++){
           piles[i] = Integer.parseInt(br.readLine());
           cases[i] = br.readLine();
        }
        
        Scanner sc = null;
        int temp = 0;
        int tempvalue = 0;
        int max;
        HashMap<Integer, Integer> hm;
        for(int i = 0; i < testcases; i++){
            max = 0;
            sc = new Scanner(cases[i]);
            sc.useDelimiter("\\s* \\s*");
            hm = new HashMap<>();
            
            while(sc.hasNext()){
                temp = sc.nextInt();
                tempvalue = 0;
                if(hm.get(temp) != null){
                 tempvalue = hm.get(temp);
                }
              hm.put(temp,tempvalue+1);
            }
            Set s = hm.keySet();
            Iterator it = s.iterator();
            
            while(it.hasNext()){
                temp = (Integer)it.next();
                if(max < hm.get(temp))
                  max = hm.get(temp);
             } 
                System.out.println(piles[i]-max); 
        }
         
    }   
}

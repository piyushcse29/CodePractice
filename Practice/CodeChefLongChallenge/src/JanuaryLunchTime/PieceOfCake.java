package JanuaryLunchTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Iterator;

public class PieceOfCake {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int testcases = Integer.parseInt(br.readLine());
         String cases[] = new String[testcases];
          for(int i=0; i < testcases; i++){
              cases[i] = br.readLine();
          }
          int prev;
          HashMap<Character, Integer> hm = null; 
          for(int i=0; i < testcases; i++){
             
              hm = new HashMap<Character, Integer>(); 
              if(cases[i].length() % 2 != 0)
                  System.out.println("NO");
              else{
              for(int j = 0; j < cases[i].length(); j++){
                   prev =0;
                  if(hm.get(cases[i].charAt(j))!=null)
                      prev = hm.get(cases[i].charAt(j));
                  hm.put(cases[i].charAt(j), prev+1);
               
               }
            if (hm.containsValue((int)Math.ceil(cases[i].length() / 2))) {
               // System.out.println(hm.size());
               // System.out.println(hm.values());
                System.out.println("YES");
            } else {
               // System.out.println((int)Math.ceil(cases[i].length() / 2));
               // System.out.println(hm.size());
               // System.out.println(hm);
                System.out.println("NO");
            }
            }      
        }
    }
}

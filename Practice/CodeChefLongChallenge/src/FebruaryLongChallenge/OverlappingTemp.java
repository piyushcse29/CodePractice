package FebruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Scanner;

public class OverlappingTemp {
  /*  public static void main(String[] args) throws IOException {
     Scanner sc;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     sc = new Scanner(br.readLine());
     sc.useDelimiter("\\s* \\s*");
     int N = sc.nextInt();
     int M = sc.nextInt();
      
      String cases[] = new String[testcases];
        for(int i = 0; i < testcases; i++){
              cases[i] = br.readLine();
        }
        int q = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        Scanner sc;
        int start = 0, startmin =100000000, end =0, endmax =0;
        int overlapping = 0;
        for(int i = 0; i < testcases; i++){
            sc = new Scanner(cases[i]);
            sc.useDelimiter("\\s* \\s*");
            int count = 0;    
            start = sc.nextInt() * 10;
            end = sc.nextInt() * 10;
            if(startmin > start)
                startmin = start;
            if(endmax < end)
                 endmax = end;
             
            for(int j = start ; j <= end; j+=5){
                 if(hm.get(j) != null)
                   count = hm.get(j);
                   hm.put(j, count + 1);
            }
         }
        System.out.println(hm);
        int max;
        for(int i = startmin; i <= endmax; i+=5){
             max = 0;
                while(i <= endmax && hm.get(i) > 1){
                   int temp = hm.get(i);
                      if(max < temp)
                         max = temp-1; 
                         i+=5;
                }
            overlapping = overlapping + max;
        }
        
        System.out.println(overlapping);
 }*/
}
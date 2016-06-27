package FebruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.BigInteger;

import java.util.Scanner;

public class RankList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        String cases[] = new String[testcases];
        for(int i = 0; i < testcases; i++){
          cases[i] = br.readLine();
        }
        
        long n = 0, s = 0L, r = 0, j = 0;
        
        Scanner sc;
        
        for(int i = 0; i < testcases; i++){
           
          sc = new Scanner(cases[i]);
          sc.useDelimiter("\\s* \\s*");
            while(sc.hasNext()){
             n = sc.nextLong();
             s = sc.nextLong();
            }  
            r = n;
            for(j = 1; j <= n; j++){
                if( j * r == s){
                  System.out.println(r-1);
                  break;
                }
                else if( j * r > s){
                  System.out.println(r);
                  break;
                }
                else if( j * r < s){
                  s = s -j;
                  r--;
                }
            }
        }
   }
}

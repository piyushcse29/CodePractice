package FebruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Scanner;

public class StrangeFormula {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(br.readLine());
        sc.useDelimiter("\\s* \\s*");
        int n = 0, m = 0;
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
        }
        
        long p[] = new long[n];
        sc = new Scanner(br.readLine());
        sc.useDelimiter("\\s* \\s*");
        for(int i = 0; i < n; i++){
              p[i] = sc.nextLong();
        }
        long sum = 0;
        long fact;
        
        for(int i = 0; i < p.length; i++ ){
            fact = 1;
            for(long j = 1; j <= p[i]; j++){
                fact = fact * j;
                 sum = sum + (j * (fact + p[i]));   
             }        
                  
        }
        System.out.println(sum % m); 
    }
}   

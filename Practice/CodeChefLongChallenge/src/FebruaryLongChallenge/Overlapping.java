package FebruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Scanner;

public class Overlapping {
    public static void main(String[] args) throws IOException {
     Scanner sc;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     sc = new Scanner(br.readLine());
     sc.useDelimiter("\\s* \\s*");
     int N = sc.nextInt();
     int M = sc.nextInt();
      
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int start = 0, end =0;
        for(int i = 0; i < N; i++){
            sc = new Scanner(br.readLine());
            sc.useDelimiter("\\s* \\s*");
            int count;    
            start = sc.nextInt();
            end = sc.nextInt();
                       
            for(int j = start ; j <= end; j++){
                 count =0;
                 if(hm.get(j) != null)
                   count = hm.get(j);
                   hm.put(j, count + 1);
            }
         }
        int output[] = new int[M];
        
        for(int i = 0; i < M; i++)
            output[i] = hm.get(Integer.parseInt(br.readLine())); 
       
        
        for(int i = 0; i < M; i++)
         System.out.println(output[i]);
    }    
}
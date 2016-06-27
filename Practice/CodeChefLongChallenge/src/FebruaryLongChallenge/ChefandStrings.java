package FebruaryLongChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Scanner;

public class ChefandStrings {
    public static void main(String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String str = br.readLine();
          int testcases = Integer.parseInt(br.readLine());
          int a = 0, b = 0, L = 0, R = 0;
          char cases1[][] = new char[testcases][2];
          int  cases2[][] = new int[testcases][2];
          Scanner sc;
          LinkedList<Integer> ls1; 
          LinkedList<Integer> ls2 ;
          int result[] = new int[testcases];
          int count;
          for(int i = 0; i < testcases; i++ ){
              count = 0;
              ls1 = new LinkedList<Integer>();
              ls2 = new LinkedList<Integer>();
              sc = new Scanner(br.readLine());
              while(sc.hasNext()){
                cases1[i][0] = sc.next().charAt(0);
                cases1[i][1] = sc.next().charAt(0);
                cases2[i][0] = sc.nextInt();
                cases2[i][1] = sc.nextInt();
              }    
              
              for(int j = cases2[i][0]-1; j < cases2[i][1]; j++){
                if(str.charAt(j) == cases1[i][0])
                   ls1.add(j);
                if(str.charAt(j) == cases1[i][1]) 
                    ls2.add(j);
              }
              
              for(int k = 0; k < ls1.size(); k++ ){
                if(ls2.isEmpty())
                    break;
                 if(ls1.get(k) < ls2.peekFirst())
                    count = count + ls2.size();
                 else{
                          ls2.pollFirst();
                          k--;
                 }   
              }
              result[i] = count;
   }
       for(int i = 0; i < result.length; i++)
          System.out.println(result[i]);
    }
}
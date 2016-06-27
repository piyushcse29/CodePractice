import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubstringDiff {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        String cases[] = new String[testcases];
        for(int i = 0; i < testcases; i++){
            cases[i] = br.readLine();
        }
        
        Scanner sc; 
        int Lmax = 0;
        String str1 = null;
        String str2 = null;
        int S = 0;
        for(int i = 0; i < testcases; i++){
            sc = new Scanner(cases[i]);
            sc.useDelimiter("\\s* \\s*");
           
                while(sc.hasNext()){
                    S = sc.nextInt();
                    str1 = sc.next();
                    str2 = sc.next();
                }
               // System.out.println(S + " " + str1 + " " + str2);
                int L = 0;
                int l,m;
                int Stemp = 0;
                Lmax = 0;
                for(int j = 0; j < str1.length(); j++){
                  for(int k = 0; k < str2.length(); k++){
                       l = j;
                       m = k;
                       L = 0;
                       Stemp = 0;
                      while((l < str1.length() && m < str2.length())){
                          //System.out.println("l and m are " + l + " " + m);
                          if(str1.charAt(l) == str2.charAt(m)){
                              //System.out.println(str1.charAt(l));
                              L++;
                              ++l;
                              ++m;
                              
                          }
                          else{// System.out.println(str1.charAt(l));
                              if(Stemp >= S)
                                  break;
                              else
                              Stemp++;
                              
                              L++;
                              ++l;
                              ++m;
                              
                          }
                      }      
                      
                     if(Lmax < L){
                         Lmax = L;
                     }
                      
                  }    
                }
            System.out.println(Lmax);
        }
       
    }
}
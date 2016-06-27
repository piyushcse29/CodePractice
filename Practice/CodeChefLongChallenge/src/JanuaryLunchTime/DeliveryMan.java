package JanuaryLunchTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DeliveryMan {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NXY = (br.readLine());
        String NIA = (br.readLine());
        String NIB = (br.readLine());
        
        int N = 0, X = 0, Y = 0;
               
        Scanner sc = new Scanner(NXY);        
        sc.useDelimiter("\\s* \\s*");
        while(sc.hasNext()){
               N = sc.nextInt();
            X = sc.nextInt(); 
        }
          
        int A[] = new int[N];
        int B[] = new int[N];
        
             sc = new Scanner(NIA);
             sc.useDelimiter("\\s* \\s*");
             int j = 0;
             while(sc.hasNext()){
                 A[j] = sc.nextInt();
                 j++;
             }
             
             sc = new Scanner(NIB);
             sc.useDelimiter("\\s* \\s*");
             j = 0;
             while(sc.hasNext()){
                 B[j] = sc.nextInt();
                 j++;
             }
             Arrays.sort(A);
             Arrays.sort(B);
             int Al = A.length;
             int Bl = B.length;
             
             j = 0; int k = 0;
             int sum = 0;
             for(int i = 0; i < N; i++){
                 if(A[Al - j -1] > A[Bl - k -1]){
                 sum = sum + A[Al - j -1];
                 j++;
                 }
                 else  if((A[Al - j -1] == A[Bl - k -1]) && N - i > 1){
                   sum = sum + A[Al - j -1] + B[Bl - k -1];
                   j++;
                   k++;
                   i++;
                }
                 else{
                      sum = sum + B[Bl - k -1];
                      k++;
                 }
             } 
             System.out.println(sum);
            
    }     
}

package FebruaryLongChallenge;

public class RLE {
    static int j = 0;
    void convert(char ch[]){
        int count = 0;
       
        for(int i =0; i < ch.length; i++){
            if(i+1 < ch.length && ch[i] == ch[i+1]){
               count++;
            }    
            else{
              ch[j++] = ch[i]; 
                String str = "" +(count+1);
                for(int k = 0; k <(str.length()); k++){
                  ch[j++] = str.charAt(k);  
                 }
            count = 0; 
            }       
        }
    }
    
    public static void main(String args[]){
        RLE rle = new RLE();
        char ch[] = {'a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','b','b','b','c','d','d'};
        rle.convert(ch);
        for(int i = 0; i < j; i++)
        System.out.print(" " + ch[i]);
    }
    
}

package FebruaryLongChallenge;


import java.util.HashMap;
import java.util.LinkedList;


public class WordToNumber {
    HashMap<String,Integer> hm = new HashMap<String, Integer>();
    static LinkedList<Integer> stack = new LinkedList<Integer>();
    WordToNumber(){
        hm.put("one", 1);
        hm.put("two",2 );
        hm.put("three", 3 );
        hm.put("four", 4);
        hm.put("five", 5);
        hm.put("six", 6);
        hm.put("seven", 7 );
        hm.put("eight", 8 );
        hm.put("nine", 9);
        hm.put("ten", 10 );        
        hm.put("eleven", 11 );
        hm.put("twelve", 12);
        hm.put("thirteen", 13 );
        hm.put("fourteen", 14 );
        hm.put("fifteen", 15 );
        hm.put("sixteen", 16 );
        hm.put("seventeen", 17 );
        hm.put("eighteen", 18 );
        hm.put("ninteen", 19 );
        
        hm.put("twenty", 20 );
        hm.put("thirty", 30 );
        hm.put("fourty", 40 );
        hm.put("fifty", 50 );
        hm.put("sixty", 60 );
        hm.put("seventy", 70 );
        hm.put("eighty", 80 );
        hm.put("ninety", 90 );
        
        hm.put("hundred", 100 );
        hm.put("thousand", 1000 );
    }  
    
    void convert(String arr[]){
        int temp =0;
       
        for(int i = arr.length -1; i >=0 ; i--){
           if( i - 1 >= 0 && hm.get(arr[i]) < 20 && hm.get(arr[i-1]) >= 20)
           {
                temp = hm.get(arr[i]);
               while(i - 1>= 0 && hm.get(arr[--i]) >20){
                   if(hm.get(arr[i]) == 100 || hm.get(arr[i]) == 1000){
                        temp += hm.get(arr[i])*hm.get(arr[--i]);
                   }
                   else
                        temp += hm.get(arr[i]);
                }
              
                stack.push(temp);
               
                 temp = 0;
                 i++;
           }
           else    
               stack.push(hm.get(arr[i]));
        }
    }
    
    public static void main(String args[]){
        String arr[] ={ "ninety","one","thousand", "one", "hundred","thirty", "three","four"};
        
         new WordToNumber().convert(arr);
         
         while(!stack.isEmpty())
           System.out.print(""+stack.pop());
        
    }
    
    
}

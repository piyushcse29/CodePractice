package Practice;

import java.util.Collections;

public class Array53 {
    public Array53() {
        super();
    }
    void nextGreater(String input){
    char ch[] = input.toCharArray();
    int len = input.length();
    int pivot = 0;
    for(int i = len-1; i >0; i--){
        if(ch[i-1] < ch[i]){
           pivot = i-1;
           break;
        }
    }
    
        for(int i = len-1; i > pivot; i--){
            if(ch[pivot] < ch[i]){
               char temp = ch[i];
               ch[i] = ch[pivot];
               ch[pivot] = temp;
               break;
            }
        }
        System.out.println(ch);
        //Now sort
    }
    public static void main(String[] args) {
        String input = "218765";
       new Array53().nextGreater(input);
   }
}

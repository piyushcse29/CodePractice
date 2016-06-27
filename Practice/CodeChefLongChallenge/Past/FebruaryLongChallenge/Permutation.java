package FebruaryLongChallenge;

public class Permutation {
        
    void func(char str[], int index){
        if(index == str.length ){            
          System.out.println(str);
          return;
        }
          
       
        for(int i = index; i < str.length; i++){
             char temp = str[index];
            str[index] = str[i];
            str[i] = temp;
           // System.out.println(str);
            func(str, index +1);
            temp = str[index];
            str[index] = str[i];
            str[i] = temp;
        }
    }
        public static void main(String args[]){
                            Permutation pm = new Permutation();    
                            char str[] = {'A', 'B', 'C'};
                            pm.func(str, 0);
       }
 
}

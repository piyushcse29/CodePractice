package Practice;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Words{
   String str;
   int index;
}

class WordCompare implements Comparator<Words>{
   public int compare(Words i, Words j) {
        return i.str.compareTo(j.str);
    }
}
public class String47 {
    public static void main(String[] args) {
       String arr[] = {"cat", "dog", "tac", "god", "act"} ;
       int size = arr.length;
       Words warr[] = new Words[size];
       
       for(int i = 0; i < size; i ++){
           warr[i] = new Words();
          warr[i].str = arr[i];
          warr[i].index = i;
          char[] chars = warr[i].str.toCharArray();
          Arrays.sort(chars);
           String sorted = new String(chars);
           warr[i].str = sorted;
           System.out.print(" "+ sorted);
        }
       System.out.println();
       Arrays.sort(warr, new WordCompare());
       
       for(int i = 0; i < size; i ++)
          System.out.print(" "+ arr[warr[i].index]);
       
   }
}

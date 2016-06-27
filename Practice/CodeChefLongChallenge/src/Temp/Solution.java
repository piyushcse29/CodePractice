import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        str = str.replace(" ","");
        str.charAt(0);
       // System.out.println(str);
        str = str.toLowerCase();
        
        HashSet<Character> hs = new HashSet<Character>();
        
        for(int i = 0; i < str.length(); i++){
            hs.add(str.charAt(i));
        }
      // System.out.println("Size is " + hs.size());
        if(hs.size() == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
        
    }
}
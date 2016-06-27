package DP;

import java.util.HashMap;


//Trie Node, which stores a character and the children in a HashMap
class TrieNode {           
 
 char value;    
 HashMap<Character,TrieNode> children;
 boolean bIsEnd;  

public TrieNode(char ch)  {
   value = ch;
   children = new HashMap<Character,TrieNode>();
   bIsEnd = false;
} 
 
}

public class Trie {
	
		 
	 static void insert(String word){
	     
	     // Find length of the given word
	     int length = word.length();        
	     TrieNode crawl = new TrieNode((char)0);
	        
	     // Traverse through all characters of given word
	     for( int level = 0; level < length; level++)
	     {
	         HashMap<Character,TrieNode> child = crawl.children;            
	         char ch = word.charAt(level);
	            
	         // If there is already a child for current character of given word 
	         if( child.containsKey(ch))
	             crawl = child.get(ch);
	         else   // Else create a child
	         {              
	        	 TrieNode temp = new TrieNode(ch);
	             child.put( ch, temp );
	             crawl = temp;
	         }
	     }
	     
	     // Set bIsEnd true for last character
	     crawl.bIsEnd=true;
	  }
	
	 public static String getMatchingPrefix(String input)  {
	     String result = ""; // Initialize resultant string
	     int length = input.length();  // Find length of the input string       
	        
	     // Initialize reference to traverse through Trie
	     TrieNode crawl = new TrieNode((char)0);
	       
	     // Iterate through all characters of input string 'str' and traverse 
	     // down the Trie
	     int level, prevMatch = 0; 
	     for( level = 0 ; level < length; level++ )
	     {    
	         // Find current character of str
	         char ch = input.charAt(level);    
	           
	         // HashMap of current Trie node to traverse down
	         HashMap<Character,TrieNode> child = crawl.children;                        
	          
	         // See if there is a Trie edge for the current character
	         if( child.containsKey(ch) )
	         {
	            result += ch;          //Update result
	            crawl = child.get(ch); //Update crawl to move down in Trie
	              
	            // If this is end of a word, then update prevMatch
	            if(crawl.bIsEnd) 
	                 prevMatch = level + 1;
	         }            
	         else  break;
	     }
	       
	     // If the last processed character did not match end of a word, 
	     // return the previously matching prefix
	     if( !crawl.bIsEnd )
	             return result.substring(0, prevMatch);        
	      
	     else
	    	 return result;
	 }
	public static void main(String args[]){
		
	     insert("are");
	   /*  insert("area");
	     insert("base");
	     insert("cat");
	     insert("cater");        
	     insert("basement");
	      
	     String input = "caterer";
	     System.out.print(input + ":   ");
	     System.out.println(getMatchingPrefix(input));              

	     input = "basement";
	     System.out.print(input + ":   ");
	     System.out.println(getMatchingPrefix(input));                      
	    */  
	     String input = "arec";
	     System.out.print(input + ":   ");
	     System.out.println(getMatchingPrefix(input));              
/*
	     input = "arex";
	     System.out.print(input + ":   ");
	     System.out.println(getMatchingPrefix(input));              

	     input = "basemexz";
	     System.out.print(input + ":   ");
	     System.out.println(getMatchingPrefix(input));                      
	      
	     input = "xyz";
	     System.out.print(input + ":   ");
	     System.out.println(getMatchingPrefix(input));   
	*/	
		
	}
	
}

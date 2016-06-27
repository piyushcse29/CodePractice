package DP;

import java.util.HashSet;

public class Dictionery {
	
	static HashSet<String> dict=null;
	Dictionery(){
		dict=new HashSet<String>();
		dict.add("i");
		dict.add("like");
		dict.add("sam");
		dict.add("sung");
		dict.add("samsung");
		dict.add("mobile");
		dict.add("ice");
		dict.add("icecream");
	}
	
	public static boolean search(String word){
		int size=word.length();
		System.out.println(size);
		if(size==0)
			return true;
		if(size==1)
			if(dict.contains(word))
					return true;
		
		for(int j=1;j<=size;j++){
			if(dict.contains(word.substring(0, j))&& search(word.substring(j,size)))
				return true;
		
		}
		return false;
			}
	
	
	public static void main(String args[]){
		new Dictionery();
		String word="icecreamicemobile";
		System.out.println(search(word));
		//if(dict.contains(word.substring(1,0)))
			System.out.println(word.substring(1,5));
	}

}

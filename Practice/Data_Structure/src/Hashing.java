import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class Hashing {
	
	
	public static void main(String args[]){
	HashMap <Integer,List<String>> hm=new HashMap<Integer,List<String>>();	
	List<String> ls=new ArrayList<String>();
	ls.add("Hi");
	ls.add("Hello");
	hm.put(1,ls);
	//hm.put(1,);
	//hm.put(2,22);
    
	System.out.println(hm.entrySet());
		
	}

}

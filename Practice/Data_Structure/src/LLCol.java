import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LLCol {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice,flag=0;
		LinkedList<Integer> ll=new LinkedList<Integer>();
		while(flag==0){
		System.out.println("Press\n1 to Add\n2 to Add at specific position\n3 to Traverse\n4 to Exit ");
		choice=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		switch(choice){
		case 1:
			System.out.println("Enter the element");
			ll.add(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
		    break;
		case 2:
			System.out.println("Enter the Position");
			int pos=(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
			System.out.println("Enter the element");
			ll.add(pos,Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
		    break;
		case 3:
			System.out.println("Traversing \n");
			Iterator<Integer> i=ll.iterator();
			while(i.hasNext())
				System.out.println(i.next());
			break;
		case 4:
			flag=1;
			break;
		}
		}

	}

}

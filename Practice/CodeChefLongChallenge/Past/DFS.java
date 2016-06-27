
import java.util.LinkedList;
public class DFS {

	public static void main(String args[]){
	int matrix[][]=new int[8][8];

	for(int i=0;i<8;i++){
		for(int j=0;j<8;j++){
			matrix[i][j]=0;
		}	
	}
	
	//Based on the graph given on Narasimha page-210
	
	matrix[0][1]=1;matrix[1][0]=1;
	matrix[1][2]=1;matrix[1][7]=1;
	matrix[2][1]=1;matrix[2][3]=1;
	matrix[2][4]=1;matrix[3][2]=1;
	matrix[4][2]=1;matrix[4][5]=1;
	matrix[4][6]=1;matrix[4][7]=1;
	matrix[5][4]=1;matrix[6][4]=1;
	matrix[7][1]=1;matrix[7][4]=1;
	
	LinkedList<Integer> ll=new LinkedList<Integer>();
	ll.add(0);
	printNodes(ll.peek());
	
	while(ll.isEmpty()==false){
		int top=ll.peek();
		for(int i=0;i<8;i++){
			if(matrix[top][i]==1&&matrix[i][top]==1){
				matrix[top][i]=matrix[i][top]=9;//Visited Nodes
				ll.addFirst(i);
				printNodes(ll.peek());
				break;
			}
			else if(i==7)
				ll.remove();
		}
		
	}
	}
	//Print Nodes
	  static void printNodes(int i){
		
		switch(i){
		case 0:System.out.println("A");break;
		case 1:System.out.println("B");break;
		case 2:System.out.println("C");break;
		case 3:System.out.println("D");break;
		case 4:System.out.println("E");break;
		case 5:System.out.println("F");break;
		case 6:System.out.println("G");break;
		case 7:System.out.println("H");break;
			
		}
	}
	
	
}

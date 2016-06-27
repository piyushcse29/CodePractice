import java.util.HashMap;

class BTree{
	  BTree left;
	  BTree right;
	  int data;
	  
	  BTree(int data){
	   this.data=data;
	}
}

public class VerticalSumBT {
	void verticalSum(BTree bt,HashMap<Integer,Integer> hm, int distance){
		int sum=0;
		if(bt!=null){	
			verticalSum(bt.left,hm,distance-1);
			sum=(hm.get(distance)!=null)?hm.get(distance):0;
			hm.put(distance,sum+bt.data);
			verticalSum(bt.right,hm,distance+1);
		}
		else return;
	}

	public static void main(String args[]){
		int distance=0;
		BTree bt=new BTree(0);
		bt.left=new BTree(1);
		bt.right=new BTree(2);
		bt.left.left=new BTree(3);
		bt.left.right=new BTree(4);
		bt.right.left=new BTree(5);
		bt.right.right=new BTree(6);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(distance, bt.data);
		new VerticalSumBT().verticalSum(bt,hm,distance);
		System.out.println(hm.entrySet());
	}
}

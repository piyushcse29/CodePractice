package Practice;

import java.util.LinkedList;
import java.util.PriorityQueue;


public class Tree28 {
    int level = 0;
    void nodeBwLevels(Tree bt, int levelmin, int levelmax){
       if(bt == null)
         return;
       Tree marker = null;
       LinkedList<Tree> queue = new LinkedList<Tree>();
           queue.addLast(bt);
           queue.addLast(marker);
             
           while(queue.isEmpty() != true){
                Tree temp = queue.pollFirst();
                 while(temp != marker && level <= levelmax){
                     
                      if(temp.left != null)
                        queue.addLast(temp.left);
                     if(temp.right != null)
                        queue.addLast(temp.right);
                     
                     if(level >= levelmin && level <= levelmax && temp != null){
                      System.out.print(" " + temp.data);
                     } 
                      temp = queue.pollFirst();
                      if(temp == marker)
                        queue.addLast(marker);
                   }
                     System.out.println();
                     ++level;
                   }
      }
    
    public static void main(String[] args) {
       Tree bt = new Tree(50);
        bt.left = new Tree(8);
        bt.right = new Tree(2);
        bt.left.left = new Tree(3);
        bt.left.right = new Tree(5);
        bt.right.left = new Tree(1);
        bt.right.right = new Tree(30);
        bt.left.left.left = new Tree(100);
        new Tree28().nodeBwLevels(bt, 1,2);
   }
}

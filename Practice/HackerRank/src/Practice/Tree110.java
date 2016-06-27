package Practice;


public class Tree110 {
    
    
    static void sumTree(Tree bt){
        if(bt == null)
         return;
        int diff = 0;
        sumTree(bt.left);
        sumTree(bt.right);
        int left = 0, right = 0;
        if(bt.left != null)
            left = bt.left.data;
        
        if(bt.right != null)
            right = bt.right.data;
        
        diff = bt.data - (left + right);
        
        if(diff < 0)
         bt.data += -diff;
        else if(diff > 0)
           adddiff(bt, diff);        
    }
    
    static void adddiff(Tree bt, int diff){
        if(bt.left != null){
            bt.left.data += diff;
            adddiff(bt.left, diff);
        }
        else if(bt.right != null){
        bt.right.data += diff;
        adddiff(bt.right, diff);
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
        
        sumTree(bt);
        bt.printTreeInorder(bt);
   }
}

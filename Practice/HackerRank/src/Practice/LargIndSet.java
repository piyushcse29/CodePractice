package Practice;

public class LargIndSet {
    
    static int larSet(Tree bt){
        if(bt == null)
         return 0;
        
        int excl = larSet(bt.left) + larSet(bt.right);
        
        int incl = 1;
        
        if(bt.left != null)
         incl += larSet(bt.left.left) + larSet(bt.left.right);
        
        if(bt.right != null)
         incl += larSet(bt.right.left) + larSet(bt.right.right);
        
        return Math.max(incl, excl);
        
        }
    public static void main(String[] args) {
       Tree bt = new Tree(50);
        bt.left = new Tree(8);
        bt.right = new Tree(2);
        bt.left.left = new Tree(3);
        bt.left.right = new Tree(5);
        bt.right.left = new Tree(1);
        bt.right.right = new Tree(30);
        
       System.out.println(larSet(bt));
   }
}

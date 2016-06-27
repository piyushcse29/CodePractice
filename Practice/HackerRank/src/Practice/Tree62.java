package Practice;


public class Tree62 {
    
    int maxlevel =-1;
    
    void leftView(Tree bt, int level){
        if(bt == null)
            return ;
        if(level > maxlevel){
            System.out.print(" " +bt.data);
            maxlevel = level;
        }
        leftView(bt.left, level+1);
        leftView(bt.right, level +1);
    }
    
    public static void main(String[] args) {
       Tree bt = new Tree(50);
        bt.left = new Tree(8);
        bt.right = new Tree(2);
        bt.left.left = new Tree(3);
        bt.left.right = new Tree(5);
        bt.right.left = new Tree(1);
        bt.right.right = new Tree(30);
       bt.right.right.right = new Tree(33);
        
        new Tree62().leftView(bt, 0);
   }
}

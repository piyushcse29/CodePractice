package Practice;


public class Tree57 {
    static int deeplevel = 0;
    static Tree deepNode = null;
    static Tree deepestLeafNode(Tree bt, int level){
        if(bt == null)
            return null;
        if(level > deeplevel && bt.left == null && bt.right == null){
                            deeplevel = level;
                            deepNode = bt;
        }
        deepestLeafNode(bt.left, level + 1);
        deepestLeafNode(bt.right, level + 1);
        return deepNode;
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
        System.out.println("Deepest leaf node is " + deepestLeafNode(bt, 0).data);
   }
}

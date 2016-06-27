package Practice;

public class Tree {    
    Tree left;
    Tree right;
    int data;
    
    Tree(int data){
        this.data = data;
    }
    
    void printTreeInorder(Tree bt){
        if(bt == null)
            return;
        
        printTreeInorder(bt.left);
        System.out.print(" "+bt.data);
        printTreeInorder(bt.right);
    
    }
}

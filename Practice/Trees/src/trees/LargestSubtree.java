package trees;

public class LargestSubtree {
   
    static BST largestSubtree(BST root){
        
        return root;
    }
   
    public static void main(String args[]){
         
        BST bs = new BST(50);
        bs.left = new BST(30);
        bs.right = new BST(60);
        bs.left.left = new BST(5);
        bs.left.right = new BST(20);
        bs.right.left = new BST(45);
        bs.right.right = new BST(70);
        bs.right.right.left = new BST(65);
        bs.right.right.right = new BST(80);
        
        largestSubtree(bs);
        
    }
    
    static class BST{
         int data;
         BST left;
         BST right;

        BST(int data){
         data = this.data;
        }
     }
 }



package GeneralPractice;

import java.util.LinkedList;

public class BT {

    int data;
    BT left;
    BT right;
    BT next;
    BT prev;
    static LinkedList<BT> stack = new LinkedList<BT>();
    static LinkedList<BT> queue = new LinkedList<BT>();
     BT(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        BT node = new BT(4);
        node.left = new BT(2);
        node.left.left = new BT(1);
        node.left.right = new BT(3);

        node.right = new BT(6);
        node.right.left = new BT(5);
        node.right.right = new BT(7);

        inOrder(node);
        System.out.println();
        predOrderNR(node);
        System.out.println();
        levelOrderNR(node);
        System.out.println();
        System.out.println(LCA(node, node.left.left, node.left.right).data);
        System.out.println("BST TO DLL\n");
        BT temp = bstToDll(node);
        while(temp != null){
        System.out.print(temp.data + " ");  
        temp = temp.next;
        }    

    }

    static void inOrder(BT node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    static void predOrderNR(BT node){
      if(node == null)
        return;
      while(true){
          while(node != null){
          System.out.print(node.data + " ");
          stack.push(node);
          node = node.left; 
          }
          if(stack.isEmpty() == false){
                node = stack.pop();
          }
          else
            break;
          
          node = node.right;
      }    
    }

    static void levelOrderNR(BT node){
         queue.add(node);
         BT temp;
         while(queue.isEmpty() != true){
             temp = queue.pollFirst();
             System.out.print(temp.data + " ");
             
             if(temp.left != null)
               queue.add(temp.left);
             
             if(temp.right != null)
               queue.add(temp.right);
         }
       queue = null;  
    }
    
    static BT LCA(BT root, BT a, BT b){
        BT left, right;
        if(root == null)
           return root;
        if(root == a || root == b){
          return root;
        }
        
        left = LCA(root.left, a, b);
        right = LCA(root.right, a, b);
        
        if(left != null && right != null)
          return root;
        else 
            return left != null ? left : right;
        }
        
    
    static BT bstToDll(BT root){
        if(root == null)
          return root;;
        bstToDllUtil(root);
        while(root.left != null)
           root = root.left;
        return root;
    }   
    static void bstToDllUtil(BT root){
        BT temp = null;
        if(root.left != null){
                 temp = root.left;
                 while(temp.right != null){
                     temp = temp.right;
                 }
                 
                temp.next = root;
                root.prev = temp;
         }
        
        if(root.right != null){
                 temp = root.right;
                 while(temp.left != null){
                     temp = temp.left;
                 }
                 
                 root.next = temp;
                 temp.prev = root;
         }
        bstToDll(root.left);
        bstToDll(root.right);
    }
    }


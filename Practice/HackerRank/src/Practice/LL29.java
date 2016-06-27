package Practice;


public class LL29 {
    
    DLL convertToBst(DLL dll){
        if(dll == null || dll.next == null)
         return dll;
        DLL root = findMid(dll);
        DLL temp = dll;
        
        while( temp.next != root)
          temp = temp.next;
        
        temp.next = null;
        DLL q = root.next;
        root.next = null;
        root.left = convertToBst(dll);
        root.right = convertToBst(q);
        
        return root;       
    }
    
    DLL findMid(DLL dll){
        DLL slow = dll;
        DLL fast = dll;
        while(fast != null){
          if(fast.next != null)
              fast = fast.next.next;
           else 
              break;
          slow = slow.next; 
        }
        return slow;
    }
    void printInorder(DLL dll){
        if(dll == null)
            return;
          printInorder(dll.left);
          System.out.print(" "+dll.data);
          printInorder(dll.right);
    }
   public static void main(String[] args) {
   DLL dll = new DLL(1);
   dll.prev = null;
   dll.next = new DLL(2);
   dll.next.prev = dll;
   dll.next.next = new DLL(3);
    dll.next.next.prev = dll.next;
    dll.next.next.next = new DLL(4);
    dll.next.next.next.prev = dll.next.next;
    dll.next.next.next.next = null;
       
    //System.out.println(new LL29().findMid(dll).data);
       new LL29().printInorder( new LL29().convertToBst(dll));
   }
   
   
}

package Practice;

public class LL10 {
        
    void reverseAlternate(LL ll){
        LL llsec;
        LL pointer = ll;
        LL llsecRoot =llsec= ll.next;
        while(pointer.next != null){
            pointer.next =pointer.next.next;
                
            if(pointer.next == null){
                llsec.next = null;
                break;
           }
          else{
               pointer = pointer.next;
                llsec.next =pointer.next;
                llsec = llsec.next;
           }
        }   
         pointer.next = reverseLL(llsecRoot);
         
         
        
        int count = 0;
        while(ll != null){
            if(count == 10)
                break;
            count++;
        System.out.print(" "+ll.data);
         ll = ll.next;
        }
    }
    
    LL reverseLL(LL ll){
        LL prev = null, next = null;
        LL current = ll;
        LL head;
        while(current != null){
           next = current.next;
           current.next = prev;
            prev = current;
            current = next;      
        }
        ll.next = null;
        return prev;
    }
    public static void main(String[] args) {
        LL ll = new LL(1);
        ll.next =new LL(2);
        ll.next.next=new LL(3);
        ll.next.next.next=new LL(4);
        ll.next.next.next.next=new LL(5);
       // ll.next.next.next.next.next=new LL(6);
       
        new LL10().reverseAlternate(ll);
    }
}

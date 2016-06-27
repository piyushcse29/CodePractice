package Practice;

public class LL11 { 
    LL reverseLL(LL ll, int k){
        if(ll == null)
          return ll;
        LL prev = null, next = null;
        LL current = ll;
        LL head;
        int count = 0;
        while(current != null && count < k){
           next = current.next;
           current.next = prev;
            prev = current;
            current = next;    
            count++;
        }
        ll.next = reverseLL(next, k);
        return prev;
    }
    public static void main(String[] args) {
        LL ll = new LL(1);
        ll.next =new LL(2);
        ll.next.next=new LL(3);
        ll.next.next.next=new LL(4);
        ll.next.next.next.next=new LL(5);
        ll.next.next.next.next.next=new LL(6);
       
        ll = new LL11().reverseLL(ll, 2);
        while(ll != null){
              System.out.print(" "+ll.data);
         ll = ll.next;
        }
    }
}

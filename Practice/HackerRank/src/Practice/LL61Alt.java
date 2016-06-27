package Practice;

public class LL61Alt { 
    LL reverseLL(LL ll){
        if(ll == null)
          return ll;
        LL prev = null, next = null;
        LL current = ll;
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
        ll.next.next.next=new LL(31);
        ll.next.next.next.next=new LL(2);
        ll.next.next.next.next.next=new LL(1);
        LL lls = ll;
        LL ll1 = new LL(ll.data);
        LL ll1s =ll1;
       
        while(ll.next != null){
            ll1.next = new LL(ll.next.data);
            ll1 = ll1.next;
            ll = ll.next;
        }
        ll1.next = null;
       
        LL ll2 = new LL61Alt().reverseLL(lls);
        
        while(ll1s != null){
            if(ll2.data != ll1s.data){
            System.out.println("Not a pallindrom");
            return;
            }
            ll1s = ll1s.next;
            ll2 = ll2.next;
        }
        System.out.println("Pallindrom");
    }
}

package Practice;

public class LL41{  
  
    static LL reverse(LL ll, int k){
    
    LL prev = null;
    LL current = ll;
    LL next = null;
    int count = 0;
    while(current != null && count <  k ){
       next = current.next;
       current.next = prev;
       prev = current;
      current = next;
      count++;
    }
    
    if(next != null){
      ll.next = reverse(next, count);
    }
       return prev;
    }
    
    public static void main(String[] args) {
        LL ll = new LL(1);
        ll.next =new LL(2);
        ll.next.next=new LL(5);
        ll.next.next.next=new LL(7);
        ll.next.next.next.next=new LL(4);
        ll.next.next.next.next.next=new LL(11);
        ll.next.next.next.next.next.next=new LL(145);
       
        //System.out.println(checkPallindrom(ll));
       ll = reverse(ll, 2);
        while(ll != null){
        System.out.print(" "+ll.data);
        ll = ll.next;
        }    
   }
}

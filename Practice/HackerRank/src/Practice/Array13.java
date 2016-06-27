package Practice;

public class Array13 {
    
    void mergeTwo(LL ll1, LL ll2){
        LL lls = ll1;
        while(lls != null){
           LL temp = ll2;
             ll2 = ll2.next;
            temp.next = lls.next;
            lls.next = temp;
            lls = temp.next;
            
            if(ll2 == null)
             break;
         }
        System.out.println("First LL");
        while(ll1 != null){
         System.out.print(" "+ ll1.data);
         ll1 = ll1.next;
        }   
        System.out.println("\nSecond LL");
        while(ll2 != null){
         System.out.print(" " +ll2.data);
           ll2 = ll2.next;
        }   
    }
    public static void main(String[] args) {
        LL ll = new LL(1);
        ll.next =new LL(2);
        ll.next.next=new LL(3);
       
       
        LL ll2 = new LL(4);
        ll2.next =new LL(5);
        ll2.next.next=new LL(6);
        ll2.next.next.next=new LL(7);
        ll2.next.next.next.next=new LL(8);
    
        new Array13().mergeTwo(ll, ll2);
    }
}

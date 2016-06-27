package Practice;
class LL{
        LL  next;   
        int data;
        LL(int data){
         this.data =data;
        }
}


public class LL36new{  
  
    static LL segregate(LL ll){
       LL temp = null;
       LL head = ll;
       LL end = ll ;
       LL prev = null;
      
        while(end.next != null){
          end = end.next;
        }
        temp = end;
       
        while(head.data %2 != 0 && head != end.next){
                temp.next = head;
                temp = temp.next;
                head = head.next;
        }
        ll = head;
      
       while(head != end.next){
           if(head.data % 2 != 0){
             temp.next = head;
             temp = temp.next;
             prev.next = head.next;
             head = head.next;
            }
           else 
            prev = head;
            head = head.next;
        }
       temp.next = null;
         return ll;
    }
    public static void main(String[] args) {
        LL ll = new LL(1);
        ll.next =new LL(2);
        ll.next.next=new LL(5);
        ll.next.next.next=new LL(7);
        ll.next.next.next.next=new LL(4);
        ll.next.next.next.next.next=new LL(11);
        ll.next.next.next.next.next.next=new LL(13);
       
        //System.out.println(checkPallindrom(ll));
       ll = segregate(ll);
        while(ll != null){
        System.out.print(" "+ll.data);
        ll = ll.next;
        }    
   }
}

package Practice;
class LL{
        LL  next;   
        int data;
        LL(int data){
         this.data =data;
        }
}


public class LL36{  
  
  
    static LL segregate(LL ll){
       LL temp = null;
       LL head = ll;
       int check = 0;
        LL htemp = null;
        
        
        while(head.data %2 != 0){
                 LL t1 = null;
                if(check == 0){
                  t1 = head;
                temp = new LL(head.data);
                htemp = temp;
                check = 1;
                }
                else{
                    temp.next = new LL(head.data);
                    temp = temp.next;
                }
            t1 = head;
            head = head.next;
            t1 = null;
            }
        ll = head;
       while(head.next != null){
           if(head.next.data % 2 != 0){
               LL t1 =head.next;
               if(check == 0){
               temp = new LL(t1.data);
               htemp = temp;
               check = 1;
               }
               else{
                   temp.next = new LL(t1.data);
                   temp = temp.next;
               }    
               head.next = t1.next;
               t1 = null;
               
            }
           else 
            head = head.next;
        }
         head.next = htemp;
     /*   while(htemp != null){
        System.out.print(" "+htemp.data);
        htemp = htemp.next;
        }*/  
    return ll;
    }
    public static void main(String[] args) {
        LL ll = new LL(3);
        ll.next =new LL(1);
        ll.next.next=new LL(7);
        ll.next.next.next=new LL(4);
        ll.next.next.next.next=new LL(3);
        ll.next.next.next.next.next=new LL(2);
        ll.next.next.next.next.next.next=new LL(1);
       
        //System.out.println(checkPallindrom(ll));
       ll = segregate(ll);
        while(ll != null){
        System.out.print(" "+ll.data);
        ll = ll.next;
        }    
   }
}

package Practice;



class LinkedListDemo{
        LinkedListDemo  next;   
        int data;
        LinkedListDemo(int data){
         this.data =data;
        }
}
public class LL1 {
    

    static void sort(LinkedListDemo ll){
          LinkedListDemo start = ll;
          
          LinkedListDemo ll1, ll1s;
          LinkedListDemo ll2, ll2s;
          ll1 = ll1s = new LinkedListDemo(start.data);
          start =  start.next;
          ll2 = ll2s = new LinkedListDemo(start.data);
          start = start.next;
       
       while(start != null){
          
           ll1.next = new LinkedListDemo(start.data);
           ll1 = ll1.next;
           start = start.next;
        
           if(start != null){
               ll2.next = new LinkedListDemo(start.data);
               ll2 = ll2.next;
               start = start.next;   
               
           } 
       }
       
       
       ll1 = ll1s;
       ll2 = ll2s;
       
       //Reversing second list
       ll2 = reverseiterative(ll2);
       
        
       start = ll;
     
       while(ll1 != null && ll2 != null && start != null){
           if(ll1.data <= ll2.data){
             start.data =ll1.data;
             start = start.next;
             ll1 = ll1.next;
            }
           else{
               start.data = ll2.data;
               start = start.next;
               ll2 = ll2.next;
            }
        }
     
       if(ll1 != null && start != null){
           while(ll1 != null){
            start.data =ll1.data;
            start =start.next;
            ll1 = ll1.next;
            }
       }
       else if(ll2 != null && start != null){
            while(ll2 != null){
             start.data =ll2.data;
             start = start.next;
             ll2 = ll2.next;
             }
        }
       
       start =ll;
       //Traversing
       while(start != null){
        System.out.print(" " + start.data);
        start = start.next;
        }
    }
    
   static LinkedListDemo reverseiterative(LinkedListDemo headNode){
        LinkedListDemo t1,t2,t3;
        
        if(headNode==null)
                return headNode;
        
        t1=headNode;
        t2=headNode.next;
        t1.next=null;
        
        while(t2!=null){
               t3=t2.next;
                t2.next=t1;
                t1=t2;
                t2=t3;
                
        }
        
        headNode=t1;
        return headNode;
    }
    
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo(10);
        ll.next =new LinkedListDemo(40);
        ll.next.next=new LinkedListDemo(53);
        ll.next.next.next=new LinkedListDemo(30);
        ll.next.next.next.next=new LinkedListDemo(67);
        ll.next.next.next.next.next=new LinkedListDemo(12);
        ll.next.next.next.next.next.next=new LinkedListDemo(89);
       
        sort(ll);
       
   }
}

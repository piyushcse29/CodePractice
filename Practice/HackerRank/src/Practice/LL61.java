package Practice;

class LinkedListDemo{
        LinkedListDemo  next;   
        int data;
        LinkedListDemo(int data){
         this.data =data;
        }
}
public class LL61{
    
   static LinkedListDemo reverseNodes(LinkedListDemo headNode, int count){
       /*
        LinkedListDemo hd =  headNode;
        System.out.println("start");
        while(hd != null){
            System.out.print(hd.data);
            hd = hd.next;
        } 
        System.out.println("\nend");
*/
        LinkedListDemo prev, next, current;
     
       current = headNode;
        prev=null;
        next=null;
        int k = 0;
        while (current != null && k < count){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                k++;
        }
        
        if(next != null)
         headNode.next = reverseNodes(next, count);
        /*
        System.out.println();
         LinkedListDemo hd = prev;
        System.out.println("----------------------");
        while(hd != null){
            System.out.print(hd.data);
            hd = hd.next;
        } 
        */
        return prev;
    }
    
   static boolean checkPallindrom(LinkedListDemo ll){
        LinkedListDemo temp = ll;
        int count = 0;
        while(temp != null){
           temp = temp.next;    
           count++;
        }
        temp = ll;
        if(count % 2 == 0)
         return evenPallindrom(temp, count);
        else 
         return oddPallindrom(temp, count);  
    }
   
   static boolean evenPallindrom(LinkedListDemo ll, int count){
        
        
        LinkedListDemo temp = ll;
        for(int i = 0; i <= count/2; i++){
         temp = temp.next;
         }
        
        while(temp != null){
          if(ll.data != temp.data)
            return false;
          ll = ll.next;
          temp = temp.next;
         }
         return true;
    }
   
   static boolean oddPallindrom(LinkedListDemo ll, int count){
       
        System.out.println();
         LinkedListDemo hd = ll;
        System.out.println("----------------------");
        while(hd != null){
            System.out.print(hd.data);
            hd = hd.next;
        } 
        ll =  reverseNodes(ll, count/2+1);
        
        System.out.println();
         hd = ll;
        System.out.println("----------------------");
        while(hd != null){
            System.out.print(hd.data);
            hd = hd.next;
        } 
       
     
       
       LinkedListDemo temp = ll;
       for(int i = 0; i <= count/2; i++){
        temp = temp.next;
        }
       
       ll = ll.next;
       while(temp != null){
           if(ll.data != temp.data){
          // System.out.println("Data is " + ll.data +" "+ temp.data);
            return false;
           } 
         ll = ll.next;
         temp = temp.next;
        }
        return true;
    }
   
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo(1);
        ll.next =new LinkedListDemo(2);
        ll.next.next=new LinkedListDemo(3);
       ll.next.next.next=new LinkedListDemo(4);
        ll.next.next.next.next=new LinkedListDemo(3);
        ll.next.next.next.next.next=new LinkedListDemo(2);
        ll.next.next.next.next.next.next=new LinkedListDemo(1);
       
        System.out.println(checkPallindrom(ll));
   }
}

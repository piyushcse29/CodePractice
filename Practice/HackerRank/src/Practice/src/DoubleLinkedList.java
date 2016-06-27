
/**
 *
 * @author piyush
 */
import java.io.*;

public class DoubleLinkedList {
      static int size=10;
      private int data;
      private DoubleLinkedList next;
      private DoubleLinkedList prev;
      
      static DoubleLinkedList headNode=null,endNode=null,
    		  headNode_second=null;
      
     
      int  ListLength(DoubleLinkedList headNode){
       int count=0;
       DoubleLinkedList temp=headNode;
       while(temp!=null){
           temp=temp.next;//.getNext();  // Learn this concept
           count++;
       }
       
       return count;
     }
      
  //Function to Insert element at any specific position of Linked List  
    void InsertInDoubleLinkedList() throws NumberFormatException, IOException{
    
    	InputStreamReader is=new InputStreamReader(System.in);
    	BufferedReader br1=new BufferedReader(is);
    	if(size>1){
        DoubleLinkedList temp=new DoubleLinkedList();
    	temp.data=Integer.parseInt(br1.readLine());
    	headNode.next=temp;
    	temp.prev=headNode;   	
    	
    	for (int i=2;i<size;i++){
        temp.next=new DoubleLinkedList();	
    	temp.next.data=Integer.parseInt(br1.readLine());
    	temp.next.prev=temp;
    	temp=temp.next;
    	}
    	endNode=temp;
    	temp.next=null;
    }
    }
    
    void InsertInDoubleLinkedList_end() throws NumberFormatException, IOException{
        
    	if(headNode==null){
    		System.out.println("No element in linked list");
    	}
    	else{
    		InputStreamReader is=new InputStreamReader(System.in);
        	BufferedReader br1=new BufferedReader(is);
        	DoubleLinkedList temp,temp_head,temp1;
        	
        
        	temp_head=headNode;
        	
        	
        	while(headNode.next!=null){
        		headNode=headNode.next;
        	}
        	
        	
        	headNode.next=new DoubleLinkedList();
        	headNode.next.prev=headNode;
        	headNode=headNode.next;
        	headNode.data=Integer.parseInt(br1.readLine());  
        	endNode=headNode;
        	headNode.next=null;
        	headNode=temp_head;
        	
                 
     	} 
    		
      
    }
    void InsertInDoubleLinkedList_merging() throws NumberFormatException, IOException{
        
    	InputStreamReader is=new InputStreamReader(System.in);
    	BufferedReader br1=new BufferedReader(is);
    	if(size>1){
        DoubleLinkedList temp=new DoubleLinkedList();
    	temp.data=Integer.parseInt(br1.readLine());
    	headNode_second.next=temp;
    	headNode_second.next.prev=headNode_second;
    	
    	for (int i=2;i<size;i++){
        temp.next=new DoubleLinkedList();	
    	temp.next.data=Integer.parseInt(br1.readLine());
    	temp.next.prev=temp;
    	temp=temp.next;
    	}
    	endNode=temp;
    	temp.next=null;
    	
    	DoubleLinkedList temp_new;
    	temp_new=headNode;
    	
    	while(headNode.next!=null){
    		headNode=headNode.next;
    	}
    	
    	headNode.next=headNode_second;
    	headNode_second.prev=headNode;
    	headNode=temp_new;
    	
    	
    }
    }

    
    
    void Sorting(){
    	
     DoubleLinkedList p=headNode,counter;
     int temp;
     
     for(;headNode!=null;headNode=headNode.next){
    	 for(counter=headNode.next;counter!=null;counter=counter.next){
    		 if(headNode.data>counter.data){
    			temp=headNode.data;
    			headNode.data=counter.data;
    			counter.data=temp;
    			 
    			 
    		 }
    		 
    		 
    	 }
    	 
     }
    	headNode=p;
    	
    }
    
    
    
    void reverseiterative(){
    	DoubleLinkedList t1,t2,t3;
    	
    	if(headNode==null)
    		return;
    	
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
    }
    
    
    
    
    
    void PrintDoubleLinkedListData(DoubleLinkedList headNode){
        if (headNode==null){
            System.out.println("There is not any elements on Linked List");
            return;
        }    
        DoubleLinkedList LNode =headNode;
        System.out.println("Traversing from front to end\n");
        while(LNode!=null){
            
           System.out.print(LNode.data+"->");
           LNode=LNode.next;
                
        }
        System.out.print("\n");
        
        LNode =endNode;
        System.out.println("Traversing from end to front\n");
        while(LNode!=null){
            
           System.out.print(LNode.data+"->");
           LNode=LNode.prev;
                
        }
        System.out.print("\n");
           
    }
    
    DoubleLinkedList DeleteNodeFromDoubleLinkedList(DoubleLinkedList headNode,int position){
    
        if(headNode==null)
               System.out.println("There is no element in Linked List \n");
            
        
        int size=ListLength(headNode);
        if(position>size||position<1){
               System.out.println("Position of note to delete is invalid. The valid inputs are 1 to " + size);
               return headNode;
        }
        
        if(position==1){   //Deleting the node inside or at the beginning 
        
              DoubleLinkedList currentNode = headNode.next;
              headNode=null;
              return currentNode;
        }else{
        
              DoubleLinkedList previousNode=headNode;
              int count = 1;
              while(count<position-1){
                    previousNode =previousNode.next;
                    count++;
              }
              
              DoubleLinkedList currentNode = previousNode.next;
              previousNode.next=currentNode.next;
              previousNode.next.prev=previousNode;
              currentNode=null;
        }
        return headNode;
    }
        
    
    
     public static void main(String args[]) throws IOException{
                
         
               InputStreamReader is=new InputStreamReader(System.in);
               BufferedReader br1=new BufferedReader(is);
               boolean choice=true; 
               while(choice){
                System.out.println("Please enter any one operation that you want to perform on Double Linked List\n" );
                System.out.println("1 for Insertion\n" );
                System.out.println("2 for Insert at end");
                System.out.println("3 for Deletion\n" );  
                System.out.println("4 for Merging\n" );  
                System.out.println("5 for Sorting\n" ); 
                System.out.println("6 for reverse_iterative\n" );
                System.out.println("7 for Complete Free\n" ); 
                System.out.println("8 for Traversing\n" );
                System.out.println("9 for Total number of Nodes in Linked List\n" );
                System.out.println("10 to Exit\n" );         
                                    
                int option = Integer.parseInt(br1.readLine());
     
                switch(option){
                    case 1: 
                             
                         System.out.println("Please enter the number of Nodes that you want to take in the DoubleLinkedList\n" );
               
                         size = Integer.parseInt(br1.readLine());
               
                         System.out.print("Now enter the elements\n");
                         headNode=new DoubleLinkedList();
                         headNode.prev=null;
                         headNode.data=Integer.parseInt(br1.readLine());
                         headNode.InsertInDoubleLinkedList();
                        
                 
                        
                         break;
                    case 2: 
                        
                        System.out.println("Please enter the element that you want to insert at the end of DoubleLinkedList\n" );
                        headNode.InsertInDoubleLinkedList_end();
                       
                
                       
                        break;
                      
                       
                        
                    case 3:
                           int position;
                           System.out.print("Please enter the position \n");
                           position=Integer.parseInt(br1.readLine());
                           headNode=headNode.DeleteNodeFromDoubleLinkedList(headNode,position);
                           break;
                        
                    case 4: 
                        
                        System.out.println("Please enter the number of Nodes that you want to take in the second DoubleLinkedList\n" );
              
                        size = Integer.parseInt(br1.readLine());
              
                        System.out.print("Now enter the elements\n");
                        headNode_second=new DoubleLinkedList();
                        headNode_second.data=Integer.parseInt(br1.readLine());
                        headNode_second.InsertInDoubleLinkedList_merging();
                       
                
                       
                        break;     
                     case 5: 
                        
                               headNode.Sorting();
                       
                
                       
                        break;  
                     case 6: 
                         
                         headNode.reverseiterative();
                 
          
                 
                       break;  
                    case 8:
                           headNode.PrintDoubleLinkedListData(headNode);
                           break;
                    case 9:    
                           System.out.print("Total count : "+headNode.ListLength(headNode)+"\n");
                           break;
                    case 10:     
                           choice=false;
                           System.out.println("Thanks for visiting Binary Beans\n" );
                           break;
           
                           
                 }
                 
               }
                 
              
     }
   
    
}

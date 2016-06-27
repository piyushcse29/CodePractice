
/**
 *
 * @author piyush
 */
import java.io.*;

public class LinkedListDemo {
      static int size=10;
      private int data;
      private LinkedListDemo next;
      static LinkedListDemo headNode=null,headNode_second=null;
      
     
      int  ListLength(LinkedListDemo headNode){
       int count=0;
       LinkedListDemo temp=headNode;
       while(temp!=null){
           temp=temp.next;//.getNext();  // Learn this concept
           count++;
       }
       
       return count;
     }
      
  //Function to Insert element at any specific position of Linked List  
    void InsertInLinkedList() throws NumberFormatException, IOException{
    
    	InputStreamReader is=new InputStreamReader(System.in);
    	BufferedReader br1=new BufferedReader(is);
    	if(size>1){
        LinkedListDemo temp=new LinkedListDemo();
    	temp.data=Integer.parseInt(br1.readLine());
    	headNode.next=temp;
    	
    	
    	for (int i=2;i<size;i++){
        temp.next=new LinkedListDemo();	
    	temp.next.data=Integer.parseInt(br1.readLine());
    	temp=temp.next;
    	}
    	temp.next=null;
    }
    }
    
    void InsertInLinkedList_end() throws NumberFormatException, IOException{
        
    	if(headNode==null){
    		System.out.println("No element in linked list");
    	}
    	else{
    		InputStreamReader is=new InputStreamReader(System.in);
        	BufferedReader br1=new BufferedReader(is);
        	LinkedListDemo temp,temp_head,temp1;
        	
        
        	temp_head=headNode;
        	
        	
        	while(headNode.next!=null){
        		headNode=headNode.next;
        	}
        	
        	
        	headNode.next=new LinkedListDemo();
        	headNode=headNode.next;
        	headNode.data=Integer.parseInt(br1.readLine());  
        	headNode.next=null;
        	headNode=temp_head;
        	
                 
     	} 
    		
      
    }
    void InsertInLinkedList_merging() throws NumberFormatException, IOException{
        
    	InputStreamReader is=new InputStreamReader(System.in);
    	BufferedReader br1=new BufferedReader(is);
    	if(size>1){
        LinkedListDemo temp=new LinkedListDemo();
    	temp.data=Integer.parseInt(br1.readLine());
    	headNode_second.next=temp;
    	
    	
    	for (int i=2;i<size;i++){
        temp.next=new LinkedListDemo();	
    	temp.next.data=Integer.parseInt(br1.readLine());
    	temp=temp.next;
    	}
    	temp.next=null;
    	
    	LinkedListDemo temp_new;
    	
    	temp_new=headNode;
    	
    	while(headNode.next!=null){
    		headNode=headNode.next;
    	}
    	
    	headNode.next=headNode_second;
    	headNode=temp_new;
    	
    	
    }
    }
    
    void Sorting(){
    	
     LinkedListDemo p=headNode,counter;
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
    	LinkedListDemo t1,t2,temp;
    	
    	if(headNode==null)
    		return;
    	
    	t1=headNode;
    	t2=headNode.next;
    	t1.next=null;
    	
    	while(t2!=null){
    		temp=t2.next;
    		t2.next=t1;
                //Move Forward
    		t1=t2;
    		t2=temp;
    		
    	}
    	
    	headNode=t1;
    }
    
    
    void PrintLinkedListData(LinkedListDemo headNode){
        if (headNode==null){
            System.out.println("There is not any elements on Linked List");
            return;
        }    
        LinkedListDemo LNode =headNode;
        while(LNode!=null){
            
           System.out.print(LNode.data+"->");
           LNode=LNode.next;
                
        }
        System.out.print("\n");
           
    }
    
    LinkedListDemo DeleteNodeFromLinkedList(LinkedListDemo headNode,int position){
    
        if(headNode==null)
               System.out.println("There is no element in Linked List \n");
            
        
        int size=ListLength(headNode);
        if(position>size||position<1){
               System.out.println("Position of note to delete is invalid. The valid inputs are 1 to " + size);
               return headNode;
        }
        
        if(position==1){   //Deleting the node inside or at the beginning 
        
              LinkedListDemo currentNode = headNode.next;
              headNode=null;
              return currentNode;
        }else{
        
              LinkedListDemo previousNode=headNode;
              int count = 1;
              while(count<position-1){
                    previousNode =previousNode.next;
                    count++;
              }
              
              LinkedListDemo currentNode = previousNode.next;
              previousNode.next=currentNode.next;
              currentNode=null;
        }
        return headNode;
    }
    
  // LinkedListDemo ll1, ll2;
    LinkedListDemo mergeSort(LinkedListDemo ll){
        LinkedListDemo ll1, ll2;
         if(ll == null || ll.next == null)
             return ll;  
         
        LinkedListDemo temp1, temp2;
        
        if(ll == null || ll.next == null){
         ll1 = ll;
         ll2 = null;
            }
        else{
            
            temp1 = ll;
            temp2 = ll.next;
            
        while(temp2 != null){
            temp2 = temp2.next;
            if(temp2 != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
            }       
        }
        
        ll1 = ll;
        ll2 = temp1.next;
        temp1.next =null;
        }
         
         
         
                           //split(ll, ll1, ll2);
                          
        System.out.println("org Data is \n");
        LinkedListDemo ll1s =ll1, ll2s = ll2;
        while(ll1s != null){
        System.out.println(ll1s.data);
        ll1s = ll1s.next;
        }  
        System.out.println("---------");
        while(ll2s != null){
        System.out.println(ll2s.data);
        ll2s = ll2s.next;
        }   
        System.out.println("org Data end \n");
        
                           ll1 = mergeSort(ll1);
                           ll2 = mergeSort(ll2);
                           
                          ll =  merge(ll1, ll2);
                         LinkedListDemo lls1 =ll;
                       
        System.out.println("----new-----");
        while(lls1 != null){
        System.out.print(" " +lls1.data);
        lls1 = lls1.next;
        }  
                          return ll;
         
    }
    
    void split(LinkedListDemo ll, LinkedListDemo ll1, LinkedListDemo ll2){
        LinkedListDemo temp1, temp2;
        
        if(ll == null || ll.next == null){
         ll1 = ll;
         ll2 = null;
            }
        else{
            
            temp1 = ll;
            temp2 = ll.next;
            
        while(temp2 != null){
            temp2 = temp2.next;
            if(temp2 != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
            }       
        }
        
        ll1 = ll;
        ll2 = temp1.next;
        temp1.next =null;
        /*
        System.out.println("Data is \n");
        
        while(ll1 != null){
        System.out.println(ll1.data);
        ll1 = ll1.next;
        }  
        System.out.println("---------");
        while(ll2 != null){
        System.out.println(ll2.data);
        ll2 = ll2.next;
        }   
        */
        }
    }
    
    LinkedListDemo  merge(LinkedListDemo ll1, LinkedListDemo ll2){
                    
            System.out.println("\nData is \n");
            LinkedListDemo ll1s =ll1, ll2s = ll2;
            while(ll1s != null){
            System.out.print(ll1s.data);
            ll1s = ll1s.next;
            }
            System.out.println("---------");
            while(ll2s != null){
            System.out.print(ll2s.data);
            ll2s = ll2s.next;
            }   
        
        
          LinkedListDemo lltemp;
            if(ll1 == null)
                return ll2;
            else if(ll2 == null)
                 return ll1;
            
        if(ll1.data < ll2.data){
                lltemp =ll1;
                lltemp.next = merge(ll1.next, ll2);
        }
        
        else{
            lltemp =ll2;
             lltemp.next = merge(ll1, ll2.next);
        }
          return lltemp;    
        }
    
     public static void main(String args[]) throws IOException{
                
         
               InputStreamReader is=new InputStreamReader(System.in);
               BufferedReader br1=new BufferedReader(is);
               boolean choice=true; 
               while(choice){
                System.out.println("Please enter any one operation that you want to perform on Linked List\n" );
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
                             
                         System.out.println("Please enter the number of Nodes that you want to take in the LinkedList\n" );
               
                         size = Integer.parseInt(br1.readLine());
               
                         System.out.print("Now enter the elements\n");
                         headNode=new LinkedListDemo();
                         headNode.data=Integer.parseInt(br1.readLine());
                         headNode.InsertInLinkedList();
                        
                 
                        
                         break;
                    case 2: 
                        
                        System.out.println("Please enter the element that you want to insert at the end of LinkedList\n" );
                        headNode.InsertInLinkedList_end();
                       
                
                       
                        break;
                      
                       
                        
                    case 3:
                           int position;
                           System.out.print("Please enter the position \n");
                           position=Integer.parseInt(br1.readLine());
                           headNode=headNode.DeleteNodeFromLinkedList(headNode,position);
                           break;
                        
                    case 4: 
                        
                        System.out.println("Please enter the number of Nodes that you want to take in the second LinkedList\n" );
              
                        size = Integer.parseInt(br1.readLine());
              
                        System.out.print("Now enter the elements\n");
                        headNode_second=new LinkedListDemo();
                        headNode_second.data=Integer.parseInt(br1.readLine());
                        headNode_second.InsertInLinkedList_merging();
                       
                
                       
                        break;     
                     case 5: 
                        
                               //headNode.Sorting();
                    //            headNode.PrintLinkedListData(
                    headNode.mergeSort(headNode);//);
                       
                
                       
                        break;  
                     case 6: 
                         
                         headNode.reverseiterative();
                 
          
                 
                       break;  
                    case 8:
                           headNode.PrintLinkedListData(headNode);
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

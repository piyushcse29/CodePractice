
/**
 *
 * @author piyush
 */
import java.io.*;

public class BST_DLL {
      static int size=10;
      private int data;
      private BST_DLL left;
      private BST_DLL right;
      static int count=0; 
      int h1,h2;
      static BST_DLL root=null,endNode=null,
    		  root_second=null;
      static BST_DLL head=null;
      
     
       int  ListLength(BST_DLL root){
       int count=0;
       BST_DLL temp=root;
       while(temp!=null){
           temp=temp.right;//.getright();  // Learn this concept
           count++;
       }
       
       return count;
     }
      
  
    BST_DLL insertInBST(BST_DLL p,int dataval) {
    
    	if(p==null){
    		p=new BST_DLL();
    		p.left=p.right=null;
    		p.data=dataval;
       }
    	
    	else if(dataval<p.data)
    		p.left=insertInBST(p.left,dataval);
    	else if(dataval>p.data)
    		p.right=insertInBST(p.right,dataval);
      	else if(dataval==p.data)
    		System.out.println("Duplicate Copy\n");
    	
    
    return p;
    }
    
    BST_DLL preorder(BST_DLL p) {
        
    	if(p!=null){
    		System.out.println(p.data);
    	preorder(p.left);
    	preorder(p.right);
    	}
    	return p;
    }
    
    void inorder(BST_DLL bs) {
    	if(bs==null)
    	    return;
    	  else{
    	    inorder(bs.left);
    	    if(count==0){
    	     head=bs;
    	     count=1;
    	    }
    	    BST_DLL temp1=convertDLL(bs.left); 
    	    if(temp1!=null){
    	    	temp1.right=bs;
    	        bs.left=temp1;
    	    }
    	   
    	    inorder(bs.right);
    	    temp1=convertDLL(bs.right);
    	    if(temp1!=null){
    	    bs.right=temp1; 
    	    temp1.left=bs;
    	    } 
    	   
    	  }  
    }
    
    BST_DLL convertDLL(BST_DLL bs){
    	if(bs!=null){
    	if(bs.left!=null)
    		bs.left.right=bs;
    	if(bs.right!=null){
    		if(bs.right.left!=null){
    			bs.right=bs.right.left;
    			bs.right.left.left=bs;
    			bs.right.left=bs;
    			return bs.right;
    		}else{
    			bs.right.left=bs;
    	        return bs.right;
    		}   
    	}
    	else return bs;
    	    
    	}
    	else return bs;
    }
    
    void printDLL(BST_DLL head){
    	
    	for(int i=0;i<7;i++){
    		System.out.println(head.data);
    		head=head.right;
    	}	
    	
    }
    
   BST_DLL postorder(BST_DLL p) {
        
    	if(p!=null){
    	preorder(p.left);
    	preorder(p.right);
    	System.out.println(p.data);
    	} return p;
    }    
   
   
   int count(BST_DLL p){
	   if(p!=null){
		    count++;
	    if(p.left!=null)
		   count(p.left);
	    if(p.right!=null)
		   count(p.right);
	   }
	return count;   
	   
   }
   
    int identical(BST_DLL p1,BST_DLL p2){
    	
    	if(p1!=null)
    		if(p1.data!=p2.data){
    			return 0;
    		}
    	if(p1.left!=null)
    		identical(p1.left,p2.left);
    	if(p1.right!=null)
    		identical(p1.right,p2.right);
    return 1;
    }

    
    
    void Sorting(){
    	
     BST_DLL p=root,counter;
     int temp;
     
     for(;root!=null;root=root.right){
    	 for(counter=root.right;counter!=null;counter=counter.right){
    		 if(root.data>counter.data){
    			temp=root.data;
    			root.data=counter.data;
    			counter.data=temp;
    			 
    			 
    		 }
    		 
    		 
    	 }
    	 
     }
    	root=p;
    	
    }
    
    
    
    void reverseiterative(){
    	BST_DLL t1,t2,t3;
    	
    	if(root==null)
    		return;
    	
    	t1=root;
    	t2=root.right;
    	t1.right=null;
    	
    	while(t2!=null){
    		t3=t2.right;
    		t2.right=t1;
    		t1=t2;
    		t2=t3;
    		
    	}
    	
    	root=t1;
    }
    
    
    
    
    
    void PrintBSTData(BST_DLL root){
        if (root==null){
            System.out.println("There is not any elements on Linked List");
            return;
        }    
        BST_DLL LNode =root;
        System.out.println("Traversing from front to end\n");
        while(LNode!=null){
            
           System.out.print(LNode.data+"->");
           LNode=LNode.right;
                
        }
        System.out.print("\n");
        
        LNode =endNode;
        System.out.println("Traversing from end to front\n");
        while(LNode!=null){
            
           System.out.print(LNode.data+"->");
           LNode=LNode.left;
                
        }
        System.out.print("\n");
           
    }
    
    int leavesCount(BST_DLL p){
     
      if((p.left==null)&&(p.right==null))
    	  count++;
       if(p.left!=null)
    	  leavesCount(p.left);
       if(p.right!=null)
    	  leavesCount(p.right);
    	  
        return count;
    }
    
    void delete(BST_DLL p){
    	
    	if(p!=null){
    		//First delete all the subtrees
    		delete(p.left);
    	    delete(p.right);
    	    p=null;
    	}
    	
    	root=null;
      	
    }
    
        
    int depth(BST_DLL p){
    	if(p==null)
    		return 0;
    	else{
    		h1=depth(p.left);
    		h2=depth(p.right);
    		if(h1>h2)
    			return (h1+1);
    		else 
    			return (h2+1);
    		
    	}
    	
    	
    }
    
    void levelOrderTraversal(BST_DLL p){
        int qsize=0;
    	BST_DLL queue[]=new BST_DLL[100];
        int queue_pointer=0;
        while(p!=null){
        	System.out.println(p.data);
        	if(p.left!=null)
        		queue[qsize++]=p.left;
        	if(p.right!=null)
        		queue[qsize++]=p.right;
        	p=queue[queue_pointer++];
        	
        }
    	
    	
    }
    
     public static void main(String args[]) throws IOException{
                
         
               InputStreamReader is=new InputStreamReader(System.in);
               BufferedReader br1=new BufferedReader(is);
               boolean choice=true; 
               while(choice){
                System.out.println("Please enter any one operation that you want to perform on Binary Search Tree\n" );
                System.out.println("1 for Insertion\n" );
                System.out.println("2 for Total Number of Nodes");
                System.out.println("3 for Deletion\n" );  
                System.out.println("4 for Check if identical or not\n" );  
                System.out.println("5 for Leaves Count\n" ); 
                System.out.println("6 for Depth of the tree\n" ) ;
                System.out.println("7 for Complete Free\n" ); 
                System.out.println("8 for Traversing\n" );
                System.out.println("9 for Level Order Traversal\n" );
                System.out.println("10 to Exit\n" );         
                                    
                int option = Integer.parseInt(br1.readLine());
     
                switch(option){
                    case 1: 
                             
                         System.out.println("Please enter the number of Nodes that you want to take in the BST\n" );
               
                         size = Integer.parseInt(br1.readLine());
               
                         System.out.print("Now enter the elements\n");
                         root=new BST_DLL();
                         root.left=null;
                         root.right=null;
                         root.data=Integer.parseInt(br1.readLine());
                         
                         for(int i=1;i<size;i++){
                        	 
                        	 root.insertInBST(root,Integer.parseInt(br1.readLine()));
                        	 
                         }
                        
                         System.out.print("Do you also want second tree. Press 'y' for YES and 'n' for NO. \n");
                         if( br1.readLine().equals("y")){
                        	 System.out.println("Please enter the number of Nodes that you want to take in the BST\n" );
                             
                             size = Integer.parseInt(br1.readLine());
                        	 System.out.print("Now enter the elements\n");
                             root_second=new BST_DLL();
                             root_second.left=null;
                             root_second.right=null;
                             root_second.data=Integer.parseInt(br1.readLine());
                             
                             for(int i=1;i<size;i++){
                            	 
                            	 root_second.insertInBST(root_second,Integer.parseInt(br1.readLine()));
                            	 
                             }
                        	 
                         }
                        	 
                        
                         break;
                    case 2: 
                        
                        System.out.println("Total number of nodes in BST are\n" +root.count(root));
                        
                       
                
                       
                        break;
                      
                       
                        
                    case 3:
                           root.delete(root);
                           break;
                        
                    case 4: 
                        
                           if(root.identical(root,root_second)==1)System.out.println("Identical"); else System.out.println("Not Identical");
                       
                
                       
                        break;     
                     case 5: 
                        
                    	 System.out.print("Total number of leave nodes\n"+root.leavesCount(root)+"\n");
                       
                
                       
                        break;  
                     case 6: 
                         
                         System.out.println("Depth of the root is \n"+root.depth(root)+"\n");
                 
          
                 
                       break;  
                    case 8:
                    	if(root!=null){
                    	   
                    	   System.out.println("Preorder\n");
                           root.preorder(root);
                           System.out.println("Inorder\n");
                            root.inorder(root);
                           System.out.println("BST to DLL\n");
                            root.printDLL(head);
                          // System.out.println("Postorder\n");
                           //root.postorder(root);
                           
                    	}
                    	else System.out.println("No elements \n");
                           break;
                    case 9:    
                    	        root.levelOrderTraversal(root);
                           break;
                    case 10:     
                           choice=false;
                           System.out.println("Thanks for visiting Binary Beans\n" );
                           break;
           
                           
                 }
                 
               }
                 
              
     }
   
    
}

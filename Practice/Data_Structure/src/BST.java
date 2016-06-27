
/**
 *
 * @author piyush
 */
import java.io.*;
import java.util.PriorityQueue;


public class BST {
	  static int diameter=0;
      static int size=10;
      private int data;
      private BST left;
      private BST right;
      static int count=0; 
      int h1,h2;
      static BST root=null,endNode=null,
    		  root_second=null;
      
     
       int  ListLength(BST root){
       int count=0;
       BST temp=root;
       while(temp!=null){
           temp=temp.right;//.getright();  // Learn this concept
           count++;
       }
       
       return count;
     }
      
  
    BST insertInBST(BST p,int dataval) {
    
    	if(p==null){
    		p=new BST();
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
    
    BST preorder(BST p) {
        
    	if(p!=null){
    		System.out.println(p.data);
    	preorder(p.left);
    	preorder(p.right);
    	}
    	return p;
    }
    
   BST postorder(BST p) {
        
    	if(p!=null){
    	preorder(p.left);
    	preorder(p.right);
    	System.out.println(p.data);
    	} return p;
    }    
   
   
   int count(BST p){
	   if(p!=null){
		    count++;
	    if(p.left!=null)
		   count(p.left);
	    if(p.right!=null)
		   count(p.right);
	   }
	return count;   
	   
   }
   
    int identical(BST p1,BST p2){
    	
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
    	
     BST p=root,counter;
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
    	BST t1,t2,t3;
    	
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
    
    
    
    
    
    void PrintBSTData(BST root){
        if (root==null){
            System.out.println("There is not any elements on Linked List");
            return;
        }    
        BST LNode =root;
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
    
    int leavesCount(BST p){
     
      if((p.left==null)&&(p.right==null))
    	  count++;
       if(p.left!=null)
    	  leavesCount(p.left);
       if(p.right!=null)
    	  leavesCount(p.right);
    	  
        return count;
    }
    
    void delete(BST p){
    	
    	if(p!=null){
    		//First delete all the subtrees
    		delete(p.left);
    	    delete(p.right);
    	    p=null;
    	}
    	
    	root=null;
      	
    }
    
        
    int depth(BST p){
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
    
    void levelOrderTraversal(BST p){
      PriorityQueue<BST> pq=new PriorityQueue<BST>();
      if(p!=null){
    	  pq.offer(p);
          pq.offer(p.right);
      }
          //  pq.add((BST)p.left);
      //pq.add((BST)p.right);
      while(!pq.isEmpty()){
    	// if(p.left!=null) 
    	 // pq.add(p.left);
    	 //if(p.right!=null)
    	 // pq.add(p.right);
    	 System.out.println(pq.poll());
      }
    	
    	
    }
    
    
    
    int DiameterofTree(BST root,int diameter){
    	  
        int leftn, rightn;
        
        if(root==null) return 0;
        
        leftn=DiameterofTree(root.left,diameter);
        rightn=DiameterofTree(root.right,diameter);
        
        if(leftn+rightn>diameter)
            diameter=leftn+rightn;

        return Math.max(leftn,rightn)+1;


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
                System.out.println("10 for Diameter of Tree\n" );
                System.out.println("11 to Exit\n" );         
                                    
                int option = Integer.parseInt(br1.readLine());
     
                switch(option){
                    case 1: 
                             
                         System.out.println("Please enter the number of Nodes that you want to take in the BST\n" );
               
                         size = Integer.parseInt(br1.readLine());
               
                         System.out.print("Now enter the elements\n");
                         root=new BST();
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
                             root_second=new BST();
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
                           System.out.println("Postorder\n");
                           root.postorder(root);
                    	}
                    	else System.out.println("No elements \n");
                           break;
                    case 9:    
                    	        root.levelOrderTraversal(root);
                           break;
                    case 10:    
                    	System.out.println(root.DiameterofTree(root,diameter));
                   break;       
                    case 11:     
                           choice=false;
                           System.out.println("Thanks for visiting Binary Beans\n" );
                           break;
           
                           
                 }
                 
               }
                 
              
     }
   
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yspiyush
 */
public class Temp {
    int data=0;
    Temp left;
    Temp right;
void hi(Temp p,int data ){
  // if(p==null){
          System.out.println("Testing 1");
           p.left=new Temp();          
           p.left.data=data;
        //   p.left=p.right=null;
           
            //return p;
     //  }
       
          
           // hi(p.left,data);
       
 /*   p.left=new Temp();
    p.left.data=1;    
    p.right=new Temp();
    p.right.data=3;    
 */
 //return p;   

}    
    
public static void main(String args[]){
    
    Temp t=new Temp();
    Temp s=new Temp();
    t.left=t.right=null;
    t.data=2;
    
    t.hi(t,1);
   // t=t.hi(t.right,3);
    
    
    System.out.println("Value.."+t.data);
    System.out.println("left"+t.left.data);


}

}



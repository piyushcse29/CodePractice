package Practice;

import java.math.BigInteger;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.AbstractMap;
import java.util.UUID;
import java.util.*;

public class Testing {
    static void getId(){
      System.out.println("hello");
    }
  
}


class Testing1 extends Testing {
    static void getId(){
      System.out.println("hello1");
    }
  public static void main(String[] args) {
      
      
       DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                  //get current date time with Date()
                  Date date = new Date();
                  System.out.println(dateFormat.format(date));
              Testing ts = new Testing1();
        Testing obj = new Testing1();
        obj.getId();
        boolean b = false;
        if(b= 10 == 11)
          System.out.println("true");
   }
}

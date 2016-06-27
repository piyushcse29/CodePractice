package Practice;

public class MinInsPallindrom {
    
    static int minIns(String pall, int i, int j){
        if(i >= j)
            return 0;
        if(pall.charAt(i) == pall.charAt(j)){
           return  minIns(pall, i+1, j-1);
        }
        
        return Math.min(minIns(pall, i+1, j) + 1, minIns(pall, i, j-1) +1);
    }
  public static void main(String[] args) {
       String pall = "abcde";
       System.out.println(new MinInsPallindrom().minIns(pall, 0, pall.length()-1));
   }
}

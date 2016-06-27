package Practice;

public class WordBreakProblem {
    
   static boolean search(String str, int i, int n){
        if(i == n)
            return true;
        
       for(int j = i; j <= n; j++){
           if(dictionary(str.substring(i, j)) && search(str, j, n)){
            return true;
            }
        }
        return false;
    }
    static boolean dictionary(String string){
                String str[] = {"i", "like", "sam", "sun", "samsun","samsun", "mobile"};
                for(int i = 0; i <str.length; i++){
                  if(str[i].equals(string))
                   return true;
                }
                return false;
    }
    
    public static void main(String args[]){
        String str = "ilikesamsung";
        System.out.println(str.length());
        System.out.println(search(str, 0, str.length()));
    }
}

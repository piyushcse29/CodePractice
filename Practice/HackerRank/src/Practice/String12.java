package Practice;

public class String12 {
    
    static void possible(String org, char temp[], int i, int j){
        if(i == org.length()){
            int k =0;
            System.out.println();
            while(temp[k] !='\0'){
             System.out.print(temp[k++]);
            }
          return;
        }
        temp[j] = org.charAt(i);
        
        possible(org, temp, i+1, j+1);
        
        temp [j] = ' ';
        temp[j+1] = org.charAt(i);
        
        possible(org, temp, i+1, j+2);
        
    }
  public static void main(String[] args) {
        String org = "ABC";
        char temp[] = new char[2*org.length()];
        temp[0] = org.charAt(0);
        possible(org, temp, 1,1);
   }
}

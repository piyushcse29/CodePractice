
/**
 *
 * @author piyush
 * 
 * String Permutation
 */


public class StringPermutaion {


/* Function to swap values at two pointers */
static void swap (char a[],int x, int y)
{
    char temp;
    temp = a[x];
    a[x] = a[y];
    a[y] = temp;
}
  
/* Function to print permutations of string
   This function takes three parameters:
   1. String
   2. Starting index of the string
   3. Ending index of the string. */
static void permute(char a[], int i, int n) 
{
   int j; 
   if (i == n)
     System.out.println(a);
   else
   {
        for (j = i; j <= n; j++)
       {
          swap(a,i,j);
          permute(a, i+1, n);
       }
   }
} 
 
/* Driver program to test above functions */
public static void main(String args[])
{
   char a[] =new char[]{'A','B','C','D'};  
   permute(a, 0, 3);
}

}
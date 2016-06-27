package DP;

public class EditDistance {
    static int distance(String s1,String s2){
		int M[][]=new int[s1.length()+1][s2.length()+1];
		M[0][0]=0;
		
		for(int i=1;i<=s1.length();i++)
			M[i][0]=i;
		
		for(int j=1;j<=s2.length();j++)
			M[0][j]=j;

		int center=0;
		for(int i=1;i<=s1.length();i++){
			for(int j=1;j<=s2.length();j++){
				if(s1.charAt(i-1)==s2.charAt(j-1))
					center=0+M[i-1][j-1];
				else
					center=1+M[i-1][j-1];
				
				M[i][j]=Math.min(Math.min(1+M[i-1][j], 1+M[i][j-1]),center);
			}
		}
		for(int i=0;i<=s1.length();i++){
			for(int j=0;j<=s2.length();j++){
				System.out.print(M[i][j]);
			}	
		        System.out.println();
		}       
		return M[s1.length()][s2.length()];
	}
	
	public static void main(String args[]){
     //String 1
		String s1="alkkkkkk";
	 //String 2	
		String s2="abc";
		System.out.println(distance(s1,s2));
	}
}

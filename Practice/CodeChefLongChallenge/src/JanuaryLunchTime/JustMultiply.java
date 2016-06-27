package JanuaryLunchTime;



import java.util.LinkedList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
 
public class JustMultiply {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tst=Integer.parseInt(br.readLine());
		for(int il=0;il<tst;il++)
		{
			String str=br.readLine();
			String strarr[]=str.split(" ");
			BigInteger m=new BigInteger(strarr[0]);
			BigInteger res=new BigInteger("1");
			for(int jl=0;jl<strarr[1].length();jl++)
			{
				String s1="",s2="";
				while(jl<strarr[1].length()&&strarr[1].charAt(jl)!='*')
				{
					s1+=strarr[1].charAt(jl);
					jl++;
				}
				jl+=2;
				while(jl<strarr[1].length()&&strarr[1].charAt(jl)!='*')
				{
					s2+=strarr[1].charAt(jl);
					jl++;
				}
				res=res.multiply(new BigInteger(s1).modPow(new BigInteger(s2),m)).mod(m);
			}
			System.out.println(res);
		}
	}
} 


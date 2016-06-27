import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Temp1 {
	public static void main(String args[]) throws IOException
	{   

			String line = null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			FileReader filein = new FileReader(br.readLine());
			FileWriter fileout = new FileWriter(br.readLine());

	           
	            BufferedReader bufferedReader = new BufferedReader(filein);
	            BufferedWriter bufferedWriter = new BufferedWriter(fileout);
	            
	            int options[]=new int[1000];
	            int i=0;
	           while((line = bufferedReader.readLine()) != null) {
	            	System.out.println(line.toString());
	            	String arr[]=line.toString().split("\\s+");
	            	int input[]=new int[Integer.parseInt(arr[0])];
	            	for(i=1;i<Integer.parseInt(arr[0])+1;i++){
	            		input[i-1]=Integer.parseInt(arr[i]);
	            	System.out.println(Integer.parseInt(arr[i]));
	            	}
	            }
	            
	            bufferedReader.close();
	            bufferedWriter.close();
	            filein.close();
	            fileout.close();
		       


  }
	}


/**
*
* @author piyush
* 
* A simple example to understand Relection
*/
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	//String parameter
		Class paramString = String.class;
		
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		 //load the MainClass at runtime
		Class cls = null;
		try {
			cls = Class.forName("MainClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Object obj = cls.newInstance();
		
		//call the printMyName method
		Method method = cls.getDeclaredMethod("printMyName",String.class);
		method.invoke(obj,"PM");
	}
}

//A method in simple class that will get called at runtime using reflection.
class MainClass {
	void printMyName(String me){
	System.out.println("My nick name is "+me+" .");	
	}
}
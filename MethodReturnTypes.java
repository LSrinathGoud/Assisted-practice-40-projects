
import java.lang.String;

public class MethodReturnTypes {

	public static void main(String[] args) {
		
		MethodReturnTypes m=new MethodReturnTypes();
		System.out.println(	m.data(24));
			System.out.println(m.doubleData(23.25));
			System.out.println(m.floatData(34.1F));
			System.out.println(m.stringData("Srinath"));
	}
	
	public int data(int d)
	{
		return d;
	}
	
	public double doubleData(double d1)
	{
		return d1;
	}
	
	public float floatData(float f)
	
	{
		return f;
	}
	
	public String stringData(String string)
	{
		return string;
	}
}

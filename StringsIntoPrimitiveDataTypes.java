
import java.util.*;

public class StringsIntoPrimitiveDataTypes {

	public static void main(String[] args) {
		
		String s="1234";
		String d="12.0";
		String f="34.1f";
		
		float f1=Float.parseFloat(f);
		System.out.println("Float=" +f1);
		
		double d1=Double.parseDouble(d);
		System.out.println("Double=" +d1);
		
		int s1=Integer.parseInt(s);
		System.out.println("Integer="+s1);
	}
}

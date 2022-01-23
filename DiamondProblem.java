public class DiamondProblem {
	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default one"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default two"); 
	    } 
	}  
	public static class TestClass implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        TestClass ob = new TestClass(); 
	        ob.show(); 
	    } 
	}

}
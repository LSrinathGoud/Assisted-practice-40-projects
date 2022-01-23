
public class AccessModifiers
{

	private int d=30;
	
	private void show()
	{
		System.out.println("private method");
	}
	public static void main(String[] args) {
		
		
		AccessModifiers a=new AccessModifiers();
		a.show(); 
        System.out.println(a.d);
        
        Methods m=new Methods(); 
        m.Public_method();
        System.out.println(m.d1);
        
        default_method d=new default_method();
        d.method1();
        System.out.println(d.d2); 
        
        Protected_method p=new Protected_method();
        p.show1();
                
	}

}

 class Methods
{
	 public int d1=40;
	 public void Public_method()
	 {
		 System.out.println("public method");
	 }
      
} 
 
 class default_method
 {                           
	 int d2=50;
	 void method1()
	 {
		System.out.println("it is a default method becoz we are not using access modifier"); 
	 }
 } 
 
 class Protected_method
 {
	 protected void show1()
	 {
		 System.out.println("it is a protected method so can't declare a value");
	 }
 }

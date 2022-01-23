public class Constructor 
{
	public int data;
	public double d;
	
  public static void main(String[] args)
  {
	  Constructor c=new Constructor(55,99.0);
	  System.out.println("parameterized constructor");  
	  System.out.println(c.data);
	  System.out.println(c.d);		
	  
	  
	  Constructor c1=new Constructor();
	  System.out.println("default constructor");
	  System.out.println(c1.data);
	 System.out.println(c1.d);
  }
  
public Constructor(int data,double d)
{
	this.data=data;
	this.d=d;
}
	public Constructor() 
	{	
		data= 23;
		d = 34.55;
	}
}


 





public class ThreadClass extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread starts running.....");
}
 	public static void main( String args[] )
 	{
  		ThreadClass mt = new  ThreadClass();
  		mt.start();
 	}
}



import java.io.*;

class Line
{
	// if multiple threads(trains) will try to access this unsynchronized method, they all will get it. So there is chance that Object's state will be corrupted 
	//put synchronized and run
	synchronized public void getLine()                     
	{
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(900);   //0.9 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Train extends Thread
{
	// reference to Line's Object.
	Line line;

	Train(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}

public class ThreadSynchronization
{
	public static void main(String[] args)
	{
		// Object of Line class that is shared among the threads.
		Line obj = new Line();

		// creating the threads that are sharing the same Object.
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);
		
		train1.setName("Train 1");
		train2.setName("Train 2");
		
		// threads start their execution.
		train1.start();
		train2.start();
		
	}
}
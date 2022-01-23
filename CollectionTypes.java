
import java.util.*;

public class CollectionTypes {

	public static void main(String[] args) {
		CollectionTypes l=new CollectionTypes();
		System.out.println("Arraylist");
				l.List();
				System.out.println("linkedlist");
		l.List1();
		System.out.println("Vector");
		l.List2();
		System.out.println("priorityqueue");
		l.priority();
		System.out.println("deque");
		l.Deque();
		System.out.println("hashset");
		l.hashSet();
		System.out.println("Linkedhashset");
		l.Linkedhash();
		System.out.println("treeset");
		l.treeSet();
	}
	
	public void List()
	{
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(3); 
		list1.add(4);
		list1.add(6);
		list1.add(null);
		System.out.println(list1); 
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Srinath");
		list2.add("Ravi");
		list2.add(null);
	
				System.out.println(list2);

	}
	public void List1()
	{
		LinkedList<String> link=new LinkedList<String>();
		link.add(null);
		link.add("Srinath");
		link.add("Srinath");//it also maintains the insertion order and it is not synchronized
		link.add(null);
		System.out.println(link);//linkedlist allows the duplicate values and null values 
	}
	
	public void List2()
	{
		Vector<Integer> v=new Vector<>();
		v.add(null);//vector uses a dynamic array to store the data elements and it is similar to arraylist
		v.add(4);//vector is synchronized
		v.add(6);
		v.add(4);
		System.out.println(v);
	}
	
	
	public void priority()
	{
		
		PriorityQueue<String> p1=new PriorityQueue();  //queue maintains the FIRST-IN-FIRST-OUT
		p1.add("Srinath");
		p1.add("Goud"); // it allows duplicate elements
		p1.add("Ravi");
		p1.add("T");
	//	p1.add(null);  priorityqueue doesnot allow the null values
		System.out.println(p1);
	
		System.out.println("head "+p1.peek());
		System.out.println(p1.isEmpty());
		System.out.println(p1.poll());
		System.out.println(p1);

	}
	
	public void Deque()
	{
		ArrayDeque<String> d1=new ArrayDeque(); // we can add or delete elements from both the ends
	//	d1.add(null); deque does not allow the null values
		d1.add("Dev");
		d1.add("Sathwik");
		d1.add("Srinith"); //but it allows the dulpicate values
		System.out.println(d1);
		System.out.println(d1.getFirst());
		System.out.println(d1.getLast());
		System.out.println(d1.isEmpty());
	}
	
	
	public void hashSet()
	{
		HashSet<Integer> h=new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(4);//it does not allow the duplicate values
		h.add(null);
		h.add(null);//it allows only one null value 
		System.out.println(h);
	}
	
	public void Linkedhash()
	{
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add(null);// it allows only one null value
		set.add("Srinath");
		set.add("Srinath"); //linkedhashset also does not allows the duplicate elements
		set.add("Ravi");
		set.add("T");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.remove(null));//it removes the null value
		System.out.println(set);
	}
	
	public void treeSet()
	{
		TreeSet<Integer> t=new TreeSet<>();
	//	t.add(null); treeset doesnot allow the null values.
		t.add(3);
		t.add(4);
		t.add(5); 
		t.add(5); //it also does not allows the duplicate values.
		System.out.println(t);
	}
}

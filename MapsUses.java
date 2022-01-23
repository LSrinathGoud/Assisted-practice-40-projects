

import java.util.*;


public class MapsUses 
{
public static void main(String[] args) {
	MapsUses map=new MapsUses();
	System.out.println("hashmap");
	map.hashMap();
	System.out.println("linkedhashmap");
	map.linkedHashMap();
	System.out.println("treemap");
	map.treeMap();
	
	
}
public void hashMap() //hashmap contains the values based on the keys 2.it contains only unique keys
{
	HashMap<Integer,String> h=new HashMap<Integer, String>();
	h.put(1, "Srinath");
	h.put(2, "Goud");// for adding the elements we had used the put() method
	h.put(3, "null");
	h.put(1, "Srinath");//it does not allow the duplicate values
	System.out.println(h);
	System.out.println(h.get(3));
	System.out.println(h.size());
}
public void linkedHashMap() //it maintains the insertion order
{
	LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
	map.put(1, null);
	map.put(2, "Srinath");
	map.put(3, "Goud");
	System.out.println(map);
	map.clear();
	System.out.println(map);
	System.out.println(map.isEmpty());
}

public void treeMap()
{
	TreeMap<Integer,String> t1=new TreeMap();
	t1.put(1, null);
	t1.put(2,"Srinath");
	t1.put(1, null); //it does not allow the null key and null value and duplicate values
	System.out.println(t1);
	System.out.println(t1.clone());
	
}
}

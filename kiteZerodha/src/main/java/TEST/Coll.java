package TEST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;



public class Coll {
public static void main(String[] args) {
/*	ArrayList ar=new ArrayList();
	ar.add("Velocity");
	ar.add(8);
	ar.add('c');
	ar.add(8);
	ar.add(null);
	ar.add(null);
	for(int i=0;i<ar.size();i++)
	{
	System.out.println(ar.get(i));
	}
	
	LinkedList li=new LinkedList();
	li.add("Velocity");
	li.add(7);
	li.add(7);
	li.add(null);
	li.add(null);
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li.get(i));
	}
	Vector v=new Vector();
	v.add("Velocity");
	v.add(9);
	v.add(9);
	v.add(null);
	v.add(null);
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i));
	}
	PriorityQueue<String> pq=new PriorityQueue<String>();
	pq.add("Velocity");
	pq.add("Katraj");
	System.out.println(pq);
	HashSet hs=new HashSet();
	hs.add("Velocity");
	hs.add(8);
	hs.add(8);
	hs.add(null);
	hs.add(null);
	Iterator it=hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	HashMap<Integer,String> hm=new HashMap<Integer,String>();	
	hm.put(1, "Velocity");
	hm.put(2, "Katraj");
	hm.put(null, null);
	hm.put(4, null);
	System.out.println(hm.get(2));
	System.out.println(hm.get(1));
	System.out.println(hm.get(null));
	System.out.println(hm.get(4));*/
	
	Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
	ht.put("Velocity", 9);
	ht.put("katraj", 8);
	//ht.put(null, null);
	ht.put("Pune", null);
	ht.put("dd", 7);
	System.out.println("Velocity");
	System.out.println("Katraj");
	System.out.println("Pune");
	System.out.println("dd");
}
}

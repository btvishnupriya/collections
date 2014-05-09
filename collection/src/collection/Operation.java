package collection;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Operation {
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	String s1;
	System.out.println("enter the customer name");
	String name=s.next();
	System.out.println("enter the Account number");
	int account=s.nextInt();
	System.out.println("enter the customer mobilenumber");
	int mobile=s.nextInt();
	System.out.println("enter the customer branch");
	String branch=s.next();
	System.out.println("enter the customer address");
	String address=s.next();
	
	CustomerDetails cd=new CustomerDetails(account, name, mobile, address, branch);

	
	do	{
		
	System.out.println("which operation to be done");
	System.out.println("1.hashset 2.treeset  3.linkedhashset 4. LinkedList  5.Arraylist 6.HashMap");
	int operation=s.nextInt();

	
	
	
	
switch(operation){
case 1:
   
    	System.out.println("Hashset operation");
    	Set hs=new HashSet();
    	hs.add(cd.getAccountNo());hs.add(cd.getCustomerName());
    	hs.add(cd.getCustomerBranch());hs.add(cd.getCustomerAdd());hs.add(cd.getMobileNo());
    	System.out.println(hs);
    	HashSet hs1=new HashSet();
    	hs1.addAll(hs);
    	System.out.println("hs1   "+hs1);
    	
         System.out.println("hs contains hs1:"+hs.containsAll(hs1));
    	System.out.println("checked"+" "+hs.isEmpty());hs.remove(address);	System.out.println("after remove"+" "+hs);
    	
    	break;
   

case 2:

	System.out.println("Treeset operation");
	Set<Object> ts=new TreeSet<Object>();	
	Set<Object> ts1=new TreeSet<Object>();
	Set<Object> ts2=new TreeSet<Object>();
	//ts.add(cd.toString().valueOf(account));ts.add(cd.getCustomerName());
	//ts.add(cd.getCustomerBranch());ts.add(cd.getCustomerAdd());ts.add(cd.toString().valueOf(mobile));
	//System.out.println(ts);
	ts.add(56);
	ts.add(68);
	ts.add(36);
	ts.add(100);ts.add(90);
	System.out.println(ts);
	ts1=((TreeSet<Object>) ts).subSet(1,3); 
	  System.out.println("subset "+" "+ts2);
    
	Iterator i = ts1.iterator();
    
    
    System.out.println("Tree subset data: ");     
    while (i.hasNext()){
       System.out.println(i.next() + " ");
	  System.out.println("Tree subset data: "+" "+ts2);  
    }
    ts2=((TreeSet<Object>) ts).headSet(65); 
    
	Iterator i1 = ts2.iterator();
    
   
	 System.out.println("Tree headset data: ");   
    while (i1.hasNext()){
       System.out.println(i1.next() + " ");
	System.out.println("Tree headset data: "+" "+ts2);  
    }
	break;
	
case 3:
	System.out.println("LinkedHashset operation");
	Set<Object> lhs=new LinkedHashSet<Object>();
	lhs.add(cd.getAccountNo());lhs.add(cd.getCustomerName());
	lhs.add(cd.getCustomerBranch());lhs.add(cd.getCustomerAdd());lhs.add(cd.getMobileNo());
	System.out.println(lhs);
	System.out.println(lhs.toArray());
	
     

case 4:
	System.out.println("Linkedlist");
	LinkedList l=new LinkedList();
	LinkedList li=new LinkedList();
	l.add(cd.getAccountNo());
	l.add(cd.getCustomerName());
	l.add(cd.getCustomerBranch());
	l.add(cd.getMobileNo());
	l.add(cd.getCustomerAdd());
	System.out.println(l);
	
	li.addAll(l);
	System.out.println(li);
	ListIterator lit=li. listIterator(2);
	while(lit.hasNext()){
		lit.next();
		lit.remove();
		System.out.println("1 after itert="+" "+li);
		
	}
	
	System.out.println("2 getfirst="+" "+l.getFirst());
	System.out.println("3 getlast="+" "+l.getLast());
	System.out.println("4 removefirst="+" "+l.removeFirst());
	System.out.println("5 removelast="+" "+l.removeLast());
	
	

	l.addLast("hello");
System.out.println("6 addlast="+" "+l);

l.addFirst("hel");
System.out.println("7 addfirst="+" "+l);

l.peek();
System.out.println("peek"+l);

l.poll();
System.out.println("poll"+l);

l.offer(name);
System.out.println("offer"+l);

l.offerFirst("thanks");
System.out.println("offerFirst"+l);

l.clear();
System.out.println("clear"+l);

System.out.println("peekFirst"+l.peekFirst());
System.out.println(" after peekFirst"+li);

System.out.println("peekLaast"+li.peekLast());
System.out.println(" after peekLast"+li);

System.out.println("pollFirst"+li.pollFirst());
System.out.println(" after poolFirst"+li);
li.pollLast();
System.out.println("poolLaast"+li);
li.push("welcome");
System.out.println("push"+li);
li.pop();
System.out.println("pop"+l);
	break;
	
case 5:	
	System.out.println("arraylist");
	ArrayList al=new ArrayList();
	al.add(cd.getAccountNo());
	al.add(cd.getCustomerName());
    al.add(cd.getMobileNo());
	al.add(cd.getCustomerAdd());
	al.add(cd.getCustomerBranch());
	System.out.println(al);
	ArrayList al1=new ArrayList();
	al1.clone();
	al1.add("hi");
	al1.add("hello");
	al1.add("hig");
	al1.add("hsi");
	al1.add("his");
	al1.add("hfi");
	al1.add("hic");
	System.out.println(al1);
	
	
	System.out.println(al.size());
	
	System.out.println("contais"+" "+al1.contains(al));
	
	System.out.println("get"+" "+al.get(1));
	
	System.out.println("set"+" "+al1.set(1, "hit"));
	System.out.println("after set"+" "+al1);
	System.out.println("remove"+" "+al.remove(3));

	System.out.println("indexof"+" "+al.indexOf(address));
	
	
	System.out.println("lastindexof"+" "+al.lastIndexOf(address));
	break;
	
	
case 6:
	System.out.println("HashMap");
	Map m=new HashMap();
	
    m.put("first", "how");
    m.put("second", "aare");
    m.put("three", "you");
    System.out.println(m);
    System.out.println(m.entrySet());
    System.out.println(m.values());
    System.out.println(m.keySet());
      m.put(account, cd);
	System.out.println("Details" +cd.getAccountNo()+" "+cd.getCustomerName()+" " +cd.getMobileNo()+" "+cd.getCustomerBranch()+" "+cd.getCustomerAdd());
	
	
	System.out.println("TreeMap");
	Map m1=new TreeMap();
	 m1.put("first", "how");
	    m1.put("second", "aare");
	    m1.put("three", "you");
	    m1.put("four", "am");
	    m1.put("five", "fine");
	    m1.put("six", "you");
	    System.out.println(m1);
	    System.out.println( "firstkey"+" "+((TreeMap) m1).firstKey());
	    System.out.println( "lastentry"+" "+((TreeMap) m1).lastEntry());
	    System.out.println("lowerentry"+" "+ ((TreeMap) m1).lowerEntry(m1));
	    System.out.println("higherentry"+" "+ ((TreeMap) m1).higherEntry(m1));
	 
	    System.out.println("LinkedHashMap");
		LinkedHashMap m2=new LinkedHashMap();
	
		System.out.println("LinkedHashMap");
		 m2.put("first", "how");
		  m2.put("second", "aare");
		    m2.put("three", "you");
		    m2.put("four", "am");
		    m2.put("five", "fine");
		    m2.put("six", "you");
		    System.out.println(m2);
		    m2.clear();
		    System.out.println(m2);
		    break;
		    default:
		    	 System.out.println("enter valid case");
		   
}
System.out.println("Do u wanna cntinue???");
s1=s.next();
	
	}while(s1.equals("y"));	

}

}

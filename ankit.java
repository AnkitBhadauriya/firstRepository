package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class SampleCollections {

	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();
		//PriorityQueue<String> q=new PriorityQueue<String>();
		Map m=new HashMap();
		m.put(1, "Ankit");
		m.put(2, "Amit");
		m.put(3, "Shivam");
		m.put(4, "Thakur");
		Set set=m.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()){
		    //Map.Entry entry=(Map.Entry)i.next();
			//System.out.println(entry.getKey()+" "+entry.getValue());
			System.out.println(i.next());
		}
		list.add("Himanshu");
		list.add("Singh");
		list.add("Bhadauriya");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		for (String name:list){
			System.out.println(name);
		}

	}

}

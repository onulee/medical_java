package p0628;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Process{
	HashMap<String,Object> read_con() {
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",100,100,99));
		
		ArrayList list2 = new ArrayList();
//		list2.add(new Card(1,"SPAED"));
//		list2.add(new Card(2,"SPAED"));
		
		HashSet set = new HashSet();
		set.add(new Person("이순신",20));
		set.add(new Person("강감찬",30));
		set.add(new Person("김구",40));
		
		HashMap<String,Object> map = new HashMap();
		map.put("list", list);
		map.put("list2", list2);
		map.put("set", set);
		
		return map;
		
	}
	
	
}

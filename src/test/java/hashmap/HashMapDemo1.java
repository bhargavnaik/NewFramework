package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;import org.checkerframework.common.reflection.qual.GetConstructor;

public class HashMapDemo1 {
	
	public static void main(String[] args)
	{
		HashMap<String, String>  hmap=new HashMap<String, String>();
		
		hmap.put("Manager", "Bhargav");
		hmap.put("Developer", "Bhargav1");
		hmap.put("Tester", "Bhargav2");
		hmap.put("Test Lead", "Bhargav3");
		
		System.out.println(hmap);
		
		Set<Entry<String, String>> entries=hmap.entrySet();
		
		for(Entry<String, String> entry:entries)
		{
			
			System.out.println(entry.getKey()+"----"+entry.getValue());
			
			System.out.println(hmap.get("Manager"));
			
			System.out.println(hmap.containsKey("Manager"));
			System.out.println(hmap.containsKey("Analyst"));
		}
	}

}

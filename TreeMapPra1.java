package wel;
import java.util.*;
public class TreeMapPra {

	public static void main(String[] args) {
		SortedMap<Integer, String> sm=new TreeMap<Integer,String>();
		sm.put(3, "threee");
		sm.put(2, null);
		sm.put(1, "one");
		sm.put(4, "four");
		sm.put(6, null);
		sm.put(5, "five");
		
		System.out.println(sm);
		for(SortedMap.Entry m:sm.entrySet())
		{
			System.out.println(sm.firstKey()+" "+sm.lastKey());
		}

	}

}

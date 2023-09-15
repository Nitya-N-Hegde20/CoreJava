package wel;
import java.util.*;
public class HashTablePra {

	public static void main(String[] args) {
		Hashtable<Integer,String>table=new Hashtable<Integer,String>();
		table.put(10, "layer");
		table.put(15, "Line");
		table.put(20, "Space");
		table.put(25, "Size");
		System.out.println(table);
		Enumeration enu= table.elements();
		System.out.println("The enumeration of values are: ");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
		}

	}

}

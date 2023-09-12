package wel;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSett {
  public static void main(String[] args) {
	  TreeSet<Integer> numbers=new TreeSet<>();
	  numbers.add(21);
	  numbers.add(5);
	  numbers.add(28);
	  System.out.println("Treeset: "+numbers);
	  
	  Iterator<Integer>it=numbers.iterator();
	  while(it.hasNext()) {
		  System.out.println(it.next());
	  }
  }
}

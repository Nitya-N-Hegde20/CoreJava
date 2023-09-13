package wel;

import java.util.*;

public class queuePrac {
 public static void main(String[] args) {
	 Queue<Integer> q = new LinkedList<>();
	 q.add(21);
	 q.add(10);
	 q.add(39);
	 q.add(12);
	 System.out.println(q);
	 int rem=q.remove();
	 System.out.println("Removed "+rem);
	 System.out.println(q);
	 int head=q.peek();
	 System.out.println("Head  "+head);
	 int siz=q.size();
	 System.out.println("Size "+siz);
 }
}

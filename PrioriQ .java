package wel;
import java.util.*;
public class PrioriQ {

	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<>();
		pq.add("Core Java");
		pq.add("HTML");
		pq.add("React");
		pq.add("CSS");
		System.out.println(pq);
		
		pq.remove("CSS");
		
		System.out.println(pq);
		System.out.println("Poll  "+pq.poll());
		System.out.println(pq);
   
		
		Iterator<String>it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}

}

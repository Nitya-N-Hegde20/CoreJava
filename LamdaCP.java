import java.util.ArrayList;

public class LamdaCP {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(70);
		list.add(20);
		list.add(50);
       for(int a:list)
    	   System.out.println(a);
		
		System.out.println("Traversing using lambda expression \n");
		list.forEach(a->System.out.println(a));
	}

}

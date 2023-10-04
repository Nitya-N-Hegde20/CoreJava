package wel;
import java.util.Arrays;
import java.util.stream.Stream;
public class StreamPra {

	public static void main(String[] args) {
		Stream<Integer>stream=Stream.of(10,20,30,40,40,50,60,70);
		//Stream can be used only once
		System.out.println("No of elements : "+stream.count());
		//stream.forEach(System.out::println);
        
		//creating a stream from array
		Integer[] values = new Integer[] {10,20,30,13,10,11,12,13};
        stream=Arrays.stream(values);
        
        //map
        System.out.println("Square of "+Arrays.toString(values)+ " is as follows: ");
        //stream.map(num->num*num).forEach(System.out::println);
        stream=stream.map(m->m*m);
        stream.forEach(System.out::println);
        
        //limit
        System.out.println("First 2 elements are: ");
        Arrays.stream(values).limit(2).forEach(System.out::println);
        
        //Skip
        System.out.println("Elements except first 4: ");
        Arrays.stream(values).skip(4).forEach(System.out::println);
        //distinct
        System.out.println("Distinct elements are: ");
        Arrays.stream(values).distinct().forEach(System.out::println);
        
        
	}

}

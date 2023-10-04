package wel;

import java.util.*;
import java.util.stream.Stream;


public class ReducePrac {

	public static void main(String[] args) {
		List <Integer>inList=Arrays.asList(1,12,-3,4,15,-6,7,8);
		Stream<Integer>stream=inList.stream();
		
		stream=stream.filter((a)->a>0);
		//stream.forEach(System.out::println);
		
		//stream=Stream.of();
		//reduce to return max number
		Optional<Integer>result=stream.reduce((a,b)->a>b?a:b);
		if(result.isPresent())
			System.out.println("Max element is : "+result.get());
		else
			System.out.println("Stream is empty for given operation ");
		

	}

}

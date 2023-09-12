package wel;
import java.util.*;
public class HashSetStudent {
public static void main(String[] args) {
	Set<StudentM> studentSet=new HashSet<StudentM>();
	addElements(studentSet);
	System.out.println(studentSet);
	
}
static void addElements(Set<StudentM> studentSet) {
	StudentM s1=new StudentM("Varsha", 92);
	studentSet.add(s1);
	s1=new StudentM("Vashika", 93);
	studentSet.add(s1);
	s1=new StudentM("Neha", 93);
	studentSet.add(s1);
	s1=new StudentM("Sinchana", 91);
	studentSet.add(s1);
	
}
}

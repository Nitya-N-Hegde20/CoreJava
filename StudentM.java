package wel;

public class StudentM {
    int marks;
    String name;
    public StudentM(String name, int marks) {
    	this.marks=marks;
    	this.name=name;
    }
    public int getMarks() {
    	return marks;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setMarks(int marks) {
    	this.marks=marks;
    }
    @Override  public int hashCode() {
    	final int prime=31;
    	int result=1;
    	result=prime*result+marks;
    	result=prime*result+((name==null)?0:name.hashCode());
    	return result;
    	
    }
    public boolean equals(Object obj) {
    	if(this==obj)
    		return true;
    	if(this==null)
    		return  false;
    	if(getClass()!=obj.getClass())
    		return false;
    
    StudentM other=(StudentM)obj;
    if(marks!=other.marks)
    	return false;
    if(name==null) {
    	if(other.name!=null)
    		return false;
    
    }
    else if(!name.equals(other.name))
    	return false;
    return true;
} 
    public String toString() {
    	return "Student[marks="+marks+",name="+name+"]";
    }
}

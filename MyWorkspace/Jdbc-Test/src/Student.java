import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
class Student implements Comparable
{
int sno;
String name;
float marks;
Student(int sno,String name,float marks)
{
	this.sno=sno;
	this.name=name;
	this.marks=marks;
	
}
void dispStudData()
{
System.out.println(sno+"  "+name+"  "+marks);

}
public int compareTo(Object obj)
{
	Student so=(Student)obj;
	//return(this.name.compareTo(so.name));
	return(this.sno-so.sno);
}
}
class StudentDemo
{
	public static void main(String k[])
	{
		Student s1=new Student(6,"amit",99f);
		Student s2=new Student(3,"vinay",87f);
		Student s3=new Student(7,"suman",98f);
		Student s4=new Student(6,"juhi",78f);
		Student s5=new Student(2,"priya",88f);
		List al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("---------------------------------");
		System.out.println("--Student data before sort");
	    Iterator itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	Object obj=itr.next();
	    	Student s=(Student)obj;
	    	s.dispStudData();
	    	
	    }
	    System.out.println("---------------------------------");
	   Collections.sort(al);
	   System.out.println("---------------------------------");
	   System.out.println("after sorted data");
	   Iterator itr1=al.iterator();
	    while(itr1.hasNext())
	    {
	    	Object obj=itr1.next();
	    	Student se=(Student)obj;
	    	se.dispStudData();
	    	
	    }
	    System.out.println("---------------------------------");
		  
	
	
	
	
	
	
	
	
	
	}
	
	
}
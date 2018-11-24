package ArrayList;
import java.util.Comparator;

public class Person  {
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}

	public String toString()
	{
		return "name:"+this.name+" age:"+this.age;
	}

}

class StudentsCompare implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
	
}
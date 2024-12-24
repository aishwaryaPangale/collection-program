package TestSample;
 
import java.util.*;
class Employee2
{
	private int id;
	private String name;
	private String position;
	public Employee2(String name, String position) {
	
		this.name=name;
		this.position=position;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		
		return name+"\t"+position;
	}
	
	
}
public class Test9 {

	public static void main(String[] args) {
	TreeMap<Integer,Employee2> map = new TreeMap<Integer,Employee2>();
	
	map.put(101, new Employee2("aish","software"));
	map.put(106, new Employee2("kirti","java"));
	map.put(103, new Employee2("bharat","php"));
	map.put(109, new Employee2("pallu","software"));
	map.put(105, new Employee2("purva","web"));
	map.put(107, new Employee2("ankita","nodejs"));
	
	
	
	Set<Map.Entry<Integer,Employee2>> entryset = map.entrySet();
	for(Map.Entry<Integer,Employee2> m :entryset)
	{
		System.out.println(m.getKey()+"\t"+m.getValue());
	}

	}

}

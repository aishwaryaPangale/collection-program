package TestSample;
import java.util.*;
class Box<T>
{
	private T object;
	public void set(T object)
	{
		this.object=object;
	}
	public T get()
	{
		return object;
		
	}
	public static void main(String[] args) {
		Box<Integer> intbox = new Box<>();
		intbox.set(42);
		System.out.println("Integer Value   = "+intbox.get());
		
		Box<String> stringbox = new Box<>();
		stringbox.set("Hello!! Good Morning");
		System.out.println("String Value    = "+stringbox.get());
		
        Box<person> p = new Box<>();
        p.set(new person("Aishwarya",101));
        System.out.println("Person Details  = "+p.get());
	}
}
class person
{
	private String name;
	private int id;
	person(String name , int id)
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		
		return "name = "+name+"\n\t\t id = "+id;
	}
	
}
//public class Test8 {
//
//	public static void main(String[] args) {
//		Box<Integer> intbox = new Box<>();
//		intbox.set(42);
//		int result = intbox.get();
//		System.out.println("Integer Value "+result);
//		
//		Box<String> stringbox = new Box<>();
//		stringbox.set("Hello!! Good Morning");
//		String str = stringbox.get();
//		System.out.println("String Value "+str);
//		
//        Box<person> p = new Box<>();
//        p.set(new person("Aishwarya",101));
//        person obj = p.get();
//        System.out.println(obj);
//	}
//
//}

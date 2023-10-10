package project1;

class box<T>
{
	T length;
	T breadth;
void acceptBoxproperties(T length)
{
	this.length=length;
}
	void acceptitsproperties(T breadth)
	{
    this.breadth = breadth;
}
 public T accesstheproperties()
{
	return length;
}
 public T accessthproperties()
 {
	 return breadth;
 }
}
public class GenericBox 
{

	public static void main(String[] args) 
	{
		box<Integer> obj=new box<Integer>();
		obj.acceptBoxproperties(10);
		System.out.println("length"+obj.accesstheproperties());
		box<Integer> obj1=new box<Integer>();
		obj.acceptitsproperties(15);
		System.out.println("breadth"+obj.accessthproperties());
	}
}


	



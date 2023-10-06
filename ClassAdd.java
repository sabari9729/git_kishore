package project1;

abstract class add
{
	add(){
		System.out.println("enter the number ");
	}
	abstract float firstmethod(float num1,float num2);
	
	abstract float secondmethod(float num1,float num2,float num3);
	
}
class first extends add
{
	float firstmethod(float num1,float num2){
		return num1+num2;
	}
	
	float secondmethod(float num1,float num2,float num3) {
		return num1+num2+num3;
	}

}
public class ClassAdd 
{
	public static void main(String[] args) 
	{
		first add=new first();
		float value=add.firstmethod(2,20);
		System.out.println(value);
		float value2=add.secondmethod(12,30,40);
		System.out.println(value2);
	}
}

	

	


	
		
	
		
	
	

		
		
	



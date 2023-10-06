package project1;
import java.util.Scanner;


public class Studentfunction 
{
	String Sname,SId;
	int m1,m2,m3,avg,total;
	void student_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enthe the name ");
		Sname=sc.nextLine();
		System.out.println("Enter the ID ");
		SId=sc.nextLine();
		System.out.println("Enter mark1 ");
		m1=sc.nextInt();
		System.out.println("Enter mark2 ");
		m2=sc.nextInt();
		System.out.println("Enter mark3 ");
		m3=sc.nextInt();	
	}
	void Display_Sdetils()
	{
		System.out.println("Student Details");
		System.out.println(Sname);
		System.out.println(SId);
		System.out.println(m2);
		System.out.println(m2);
		System.out.println(m3);
		avg=m1+m2+m3;
		total=avg/3;
		System.out.println("The tolal is"+total);
	}

	public static void main(String[] args) 
	{
		Studentfunction obj=new Studentfunction();
		obj.student_details();
		obj.Display_Sdetils();
	}

}

import java.util.Scanner;

class Car
{
String brand;
int price;


public Car(String b,int p)
{
brand=b;
price=p;

}


public void getCar()
{
System.out.println("brand is:" +brand);
System.out.println("car price:" +price);
}
}

class CarMain
{
public static void main(String args[])
{
Car c=new Car("OLO",10000);
c.getCar();
}
}





class Student
{
private String name;
private int age;

public void setName(String n)
{
name=n;
}

public void setAge(int a)
{
age=a;
}


public String getName()
{
return name;
}

public int getAge()
{
return age;
}
}

class StudntMain
{
public static void main(String args[])
{
Student s1=new Student();

Scanner in=new Scanner(System.in);
System.out.println("Enter Student Name");
String name=in.next();

System.out.println("Enter Student Age");
int age=in.nextInt();


s1.setName(name);
s1.setAge(age);

System.out.println("Student Name is:"+ s1.getName());
System.out.println("Student Age is:"+ s1.getAge());
}
}


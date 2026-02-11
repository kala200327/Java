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

public class CarMain
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

class StudntMain
{
public static void main(String args[])
{
Student s=new Student();
s1.setName("kala");
s1.setAge(20);

System.out.println("Student Name is:"+getName());
System.out.println("Student Age is:"+getAge());
}
}


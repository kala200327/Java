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
System.out.println("brand is:" brand)
System.out.println("car price:" price)
}
}

public class CarMain
{
public static void main(String args[])
{
Car c=new Car(OLO,1,00000);
c.getCar();
}
}
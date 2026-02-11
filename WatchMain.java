import java.util.Scanner;
class Watch
{
private String brand;
private double price;
private String model;

public Watch(String brand,double price,String model)
{
this.brand=brand;
this.price=price;
this.model=model;
}

public String getBrand()
{
return brand;
}

public double getPrice()
{
return price;
}

public String getModel()
{
return model;
}
}

class WatchMain
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Watch Brand");
String brand=in.next();
System.out.println("Enter Watch Price");
double price=in.nextDouble();
System.out.println("Enter Watch Model");
String model=in.next();

Watch w=new Watch(brand,price,model);
w.getBrand();
w.getPrice();
w.getModel();

System.out.println("Watch brand is:"+brand);
System.out.println("Watch Price:"+price);
System.out.println("Watch Model:"+model);
}
}

 
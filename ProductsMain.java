import java.util.Scanner;


class Product
{
private String name;
private double price;



public void setName(String n)
{
name=n;
}
public void setPrice(double p)
{
price=p;
}

public String getName()
{
return name;
}
public double getPrice()
{
return price;
}
}

class ProductMain
{
public static void main(String args[])
{
Product[] p=new Product[2];
p[0]=new Product();
p[0].setName("Novel");
p[0].setPrice(500);

p[1]=new Product();
p[1].setName("Story");
p[1].setPrice(740);




for(int i=0;i<p.length;i=i+1)
{
System.out.println("Product name:"+ p[i].getName());
System.out.println("Product price:"+ p[i].getPrice());
}
}
}




//






class Products
{
private String name;
private double price;



public void setName(String n)
{
name=n;
}
public void setPrice(double p)
{
price=p;
}

public String getName()
{
return name;
}
public double getPrice()
{
return price;
}
}



class ProductsMain
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);

System.out.println("How many Products?");
int n=in.nextInt();



Product[] p=new Product[n];

for(int i=0;i<n;i=i+1)
{
p[i]=new Product();
System.out.println("Enter product name:");
String name=in.next();
p[i].setName(name);


System.out.println("Enter product Price:");
int price=in.nextInt();
p[i].setPrice(price);
}

System.out.println("All products are:");

for(int i=0;i<n;i=i+1)
{
System.out.println("Product Name is:" +p[i].getName());
System.out.println("Product Price is:" +p[i].getPrice());
}
}
}








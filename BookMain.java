import java.util.Scanner;
class Book
{
private String bname;
private int price;

public Book(String bname,int price)
{
this.bname=bname;
this.price=price;
}

public String getBname()
{
return bname;
}

public int getPrice()
{
return price;
}
}


class BookMain
{
public static void main(String args[])
{
Book[] b=new Book[3];
int i,maxprice=0;
for(i=0;i<3;i=i+1)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Book Name:");
String bname=in.next();
System.out.println("Enter Book Price:");
int price=in.nextInt();

b[i]=new Book(bname,price);
}
maxprice=b[0].getPrice();

for(i=1;i<3;i=i+1)
{
if(maxprice<b[i].getPrice())
{
maxprice=b[i].getPrice();
}
}
System.out.println("maxprice is:"+maxprice);
}
}


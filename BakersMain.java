import java.util.Scanner;
class Bakers
{
private int id;
private String bname;
private float rating;
private Boolean online_delivery;

public void getBakers()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Bakers id:");
id=in.nextInt();
System.out.println("Enter Bakers name:");
bname=in.next();
System.out.println("Enter Bakers rating:");
rating=in.nextFloat();
System.out.println("Enter Bakers online_delivery:");
online_delivery=in.nextBoolean();
}

public void putBakers()
{
System.out.println("Bakers id="+id);
System.out.println("Bakers name="+bname);
System.out.println("Bakers rating="+rating);
System.out.println("Bakers online_delivery="+online_delivery);
}
}

class BakersMain
{
public static void main(String args[])
{
Bakers b1=new Bakers();
b1.getBakers();
b1.putBakers();
}
}

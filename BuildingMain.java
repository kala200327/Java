import java.util.Scanner;
class Building
{
private String btype;
private double sqrft;
private double rate_per_sqrft;
private String place;

public void setBtype(String btype)
{
this.btype=btype;
}
public String getBtype()
{
return btype;
}

public void setSqrft(double sqrft)
{
this.sqrft=sqrft;
}
public double getSqrft()
{
return sqrft;
}

public void setRate_per_sqrft(double rate_per_sqrft)
{
this.rate_per_sqrft=rate_per_sqrft;
}
public double getRate_per_sqrft()
{
return rate_per_sqrft;
}

public void setPlace(String place)
{
this.place=place;
}
public String getPlace()
{
return place;
}
}

class BuildingMain
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);

System.out.println("Enter Building Type:");
String btype=in.next();

System.out.println("Enter Building Sqrft:");
double sqrft=in.nextDouble();

System.out.println("Enter Building Rate per sqrft:");
double rate_per_sqrft=in.nextDouble();

System.out.println("Enter Building place:");
String place=in.next();


Building b1=new Building();
b1.setBtype(btype);
b1.setSqrft(sqrft);
b1.setRate_per_sqrft(rate_per_sqrft);
b1.setPlace(place);

System.out.println("Building Type is:"+btype);
System.out.println("Building Sqrft is:"+sqrft);
System.out.println("Building Per sqrft is:"+rate_per_sqrft);
System.out.println("Building Place is:"+place);
}
}


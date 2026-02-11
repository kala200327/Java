class Teashop
{
private int trate;
private String flavor;
private String snacks;
private int time;

public void setTrate(int trate)
{
this.trate=trate;
}
public int getTrate()
{
return trate;
}

public void setFlavor(String flavor)
{
this.flavor=flavor;
}
public String getFlavor()
{
return flavor;
}

public void setSnacks(String snacks)
{
this.snacks=snacks;
}
public String getSnacks()
{
return snacks;
}

public void setTime(int time)
{
this.time=time;
}
public int getTime()
{
return time;
}
}

class TeashopMain
{
public static void main(String args[])
{
Teashop t1=new Teashop();
t1.setTrate(10);
t1.setFlavor("Herbel Tea");
t1.setSnacks("Somosas");
t1.setTime(10);

System.out.println("Trate is:"+t1.getTrate());
System.out.println("Flavor is:"+t1.getFlavor());
System.out.println("Snacks is:"+t1.getSnacks());
System.out.println("Time is:"+t1.getTime());
}
}





import java.util.Scanner;

class Associate
{
public int id;
public String name;
public String technology;
public int experienceInYears;

public Associate(int id.String name,String technology,int experienceInYears)
{
this.id=id;
this.name=name;
this.technology=technology;
this.experienceInYears=experienceInYears;
} 

public void setId(int id)
{
this.id=id;
}
public int getId()
{
return id;
}

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}

public void setTechnology(String Technology)
{
this.technology=technology;
}
public String getTechnology()
{
return technology;
}

public void setExperienceInYears(int experienceInYears)
{
this.experienceInYears=experienceInYears;
}
public int getexperienceInYears()
{
return experienceInYears;
}

public void searchtechnology(Associate[] a,String)
{
for(i=0;i<5;i=i+1)
{
System.out.println(a[i].getTechnology());
}
}

public Associateofgiventechnology(Associate[]a,String)
{
for(int i=0;i<5;i=i+1)
{
if(a[i].getTechnology.equals(technology))
{
System.out.println(a[i].getTechnology);
}
}




class SolutionMain
{
public static void main (String args[])
{
Associate[] a=new Associate[5]

for(int i=0;i<5;i=i+1)
{
Scanner in=new Scanner(System.in)
id=in.nextInt();
name=in.next();
technology=in.next();
experienceInYears=in.nextInt();

Associate[i]=new Associate(id,name,technology,experienceInYears)
}








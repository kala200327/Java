import java.util.Scanner;
class Employee
{
private int id;
private String empname;
private String designation;
private double salary;

public Employee(int id,String empname,String designation,double salary)
{
this.id=id;
this.empname=empname;
this.designation=designation;
this.salary=salary;
}

public int getId()
{
return id;
}
public String getEmpname()
{
return empname;
}
public String getdesignation()
{
return designation;
}
public double getSalary()
{
return salary;
}


public double getMaxsalary(Employee[] e)
{
double maxsalary=0; 
int n = e.length;
maxsalary=e[0].getSalary();
for(int i=1;i<n;i=i+1)
{
if(maxsalary<e[i].getSalary())
{
maxsalary=e[i].getSalary();
}
}
return maxsalary;
}

public double getAvgsalary(Employee[] e)
{
double avg=0,sum=0;
int n = e.length;

for(int i=0;i<n;i=i+1)
{
sum=sum+e[i].getSalary();
}
avg=sum/n;
return avg;
} 
}

class EmployMain
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Hou many employees");
int n=in.nextInt();
Employee[] e=new Employee[n];

for(int i=0;i<n;i=i+1)
{
System.out.println("Enter Employee Id:");
int id=in.nextInt();

System.out.println("Enter Employee Name:");
String empname=in.next();

System.out.println("Enter Employee Designation:");
String designation=in.next();

System.out.println("Enter Employee Salary:");
double salary=in.nextDouble();

e[i]=new Employee(id,empname,designation,salary);
}

double maxsalary = e[0].getMaxsalary(e);
double avg  = e[0].getAvgsalary(e);

System.out.println("maximum salary is:"+maxsalary);
System.out.println("Average salary is:"+avg);
}
}

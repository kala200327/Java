import java.util.Scanner;
class Admissionssss
{
private int admno;
private String college_name;
private String department;
private float fees;

public void getAdmission()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter AdmNo:");
admno=in.nextInt();
System.out.println("Enter College Name:");
college_name=in.next();
System.out.println("Enter Department:");
department=in.next();
System.out.println("Enter fees:");
fees=in.nextFloat();
}

public void putAdmission()
{
System.out.println("Adm No="+admno);
System.out.println("College Name="+college_name);
System.out.println("Department="+department);
System.out.println("college fees="+fees);
}
}

class AdmissionMain
{
public static void main(String args[])
{
Admission a1=new Admission();
a1.getAdmission();
a1.putAdmission();
}
}
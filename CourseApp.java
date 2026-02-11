import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


class DBoperations
{

private static final String URL = "jdbc:mysql://localhost:3306/institute";

private static final String USER= "root";
private static final String PASSWORD= "root";
private Connection conn;



public void Connect()
{
try {
            // Load MySQL driver (Connector/J 8.x)
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connected to MySQL " + conn.getMetaData().getDatabaseProductVersion());
         
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

public void insertRecord(String coursename,String duration,Double fees)
{
String sql="INSERT INTO COURSE(coursename,duration,fees)VALUES(?,?,?)";

try(PreparedStatement pstmt=conn.prepareStatement(sql))
{
pstmt.setString(1,coursename);
pstmt.setString(2,duration);
pstmt.setDouble(3,fees);

int rows=pstmt.executeUpdate();
System.out.println(rows +"record inserted.");
}
catch(SQLException e)
{
e.printStackTrace();
}
}


public void updateRecord(String coursename,String duration,Double fees,int id)
{
String sql="UPDATE course SET coursename=?,duration=?,fees=? WHERE ID=?";

try(PreparedStatement pstmt=conn.prepareStatement(sql))
{
pstmt.setString(1,coursename);
pstmt.setString(2,duration);
pstmt.setDouble(3,fees);
pstmt.setInt(4,id);

int rows=pstmt.executeUpdate();
System.out.println(rows +"record Updated.");
}
catch(SQLException e)
{
e.printStackTrace();
}
}


public void deleteRecord(int id)
{
String sql="DELETE FROM course WHERE id=?";

try(PreparedStatement pstmt=conn.prepareStatement(sql))
{
pstmt.setInt(1,id);

int rows=pstmt.executeUpdate();
System.out.println(rows +"record Deleted.");
}
catch(SQLException e)
{
e.printStackTrace();
}
}

public void viewRecord()
{
String sql="SELECT *FROM course";

try(PreparedStatement pstmt=conn.prepareStatement(sql);
     ResultSet rs= pstmt.executeQuery())
{
System.out.println("\nID\tcoursename\tduration\tfees");
System.out.println("________________________________");

while(rs.next())
{
System.out.println(rs.getInt("id") + "\t" + rs.getString("coursename") + "\t"+ rs.getString("duration") + "\t" + rs.getDouble("fees"));
}
}
catch(SQLException e)
{
e.printStackTrace();
}
}
}


public class CourseApp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
DBoperations db=new DBoperations();
db.Connect();

while(true)
{
System.out.println("\n===Course Management===");
System.out.println("1.Insert Record");
System.out.println("2.Update Record");
System.out.println("3.Delete Record");
System.out.println("4.View Record");
System.out.println("5.EXIT");
System.out.println("Enter choice:");
int choice=sc.nextInt();
sc.nextLine();


switch(choice)
{
case 1:

System.out.println("Enter course name:");
String coursename= sc.nextLine();

System.out.println("Enter course duration:");
String duration= sc.nextLine();


System.out.println("Enter course fees:");
double fees= sc.nextDouble();

db.insertRecord(coursename,duration,fees);
break;

case 2:

System.out.println("Enter course id to update:");
int uid=sc.nextInt();
sc.nextLine();

System.out.println("Enter course name:");
String ucoursename= sc.nextLine();

System.out.println("Enter course duration:");
String uduration= sc.nextLine();


System.out.println("Enter course fees:");
double ufees= sc.nextDouble();

db.updateRecord(ucoursename, uduration, ufees, uid);
break;

case 3:

System.out.println("Enter course id to delete:");
int did=sc.nextInt();
db.deleteRecord(did);
break;

case 4:

db.viewRecord();
break;

case 5:
System.out.println("Existing...");
sc.close();
System.exit(0);

default:
System.out.println("Invalid choice");
}
}
}
}






+






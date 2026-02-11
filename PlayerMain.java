import java.util.Scanner;
class player
{
private int id;
private String skill;
private String level;
private int points;

public Player(int id,String skill,String level,int points)
{
this.id=id;
this.skill=skill;
this.level=level;
this.points=points;
}

public int getId()
{
return id;
}

public String getSkill()
{
return skill;
}

public String getLevel()
{
return level;
}

public int getPoints()
{
return points;
}
}

public void getPlayerskill(Player[]p,String skill)
{
int n=p.length;
for(int i=0;i<n;i=i+1)
{
if(p[i].getSkill().equals(skill))
{
System.out.println(p[i].getPoints());
}
}
}


class PlayerMain
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("How many players u want");
int n=in.nexiInt();
Player p=new Player[n];
for(int i=0;i<n;i=i+1)
{
System.out.println("Enter player id");
int id=in.nextInt();
System.out.println("Enter player Skill");
String skill=in.next();
System.out.println("Enter player Level");
String level=in.next();
System.out.println("Enter player Points");
int points=in.nextInt();

p[i]=new Player(id,skill,level,points);
}
p[0].getPlayerskill(p,"Bouncer");
}
}



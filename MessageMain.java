package mypackage;

class Message
{
public void greet()
{
System.out.println("Hello");
}
}

import mypackage.Message;

public class Mainprogram
{
public static void main(String args[])
{
Message msg=new Message();
msg.greet();
}
}
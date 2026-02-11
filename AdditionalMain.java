import java.util.Scanner;

public class Dharu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digit Number:");
        int num1 = sc.nextInt();
        int sumE=0,sumO=0,num1;
        while(num=0){
              num1=num%10;
              if(num1%2==0){
                  sumE=sumE+num1;
              }
              else{
                  sumO=sumO+num1;
              }
              num=num/10;
        }
        System.out.println(sumE+" "+sumO);
        if(sumE==sumO){
            System.out.println("Lead number");
        }
        else{
            System.out.println("Not a Lead number");

        

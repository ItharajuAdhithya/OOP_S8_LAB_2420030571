package lab2;
import java.util.Scanner;
public class Palidrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int org=num;
int rem,rev=0;
while(num!=0) {
  rem=num%10;
  rev=rev*10+rem;
  num/=10;
}
if(org==rev) {
  System.out.println("it is palidrome");
}else {
  System.out.println("it is not palidrome");
}

  }

}
package lab2;
import java.util.Scanner;
public class Character {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character");
    char ch= sc.next().charAt(0);
    if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
      System.out.println("It is an aplhabet");
    }else {
      System.out.println("It is not an aplhabet");
    }
    

  }

}
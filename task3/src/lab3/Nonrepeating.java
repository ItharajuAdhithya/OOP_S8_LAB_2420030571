package lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Nonrepeating {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a string: ");
     String S1 = sc.next();
     char[] s1 = S1.toCharArray();
     char C;
       int i,j;
       int count;

       for(i = 0; i < s1.length; i++)
       {
         C = s1[i];
         count = 0;
         for(j = 0; j < s1.length; j++)
         {
           if(C == s1[j])
           {
             count++;
           }
         }
         
         if(count == 1)
         {
           System.out.println("The first non-repeating letter is " + C);
           break;
         }
      }
 }
}
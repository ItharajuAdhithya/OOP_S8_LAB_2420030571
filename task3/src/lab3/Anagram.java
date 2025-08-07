package lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         System.out.print("Enter string one: ");
         String str1 = sc.nextLine();
         System.out.print("Enter string two: ");
         String str2 = sc.nextLine();
         str1 = str1.replaceAll("\\s", "").toLowerCase();
         str2 = str2.replaceAll("\\s", "").toLowerCase();
         if (str1.length() != str2.length()) {
             System.out.println("Not anagrams");
             return;
         }
         char[] ch1 = str1.toCharArray();
         char[] ch2 = str2.toCharArray();
         Arrays.sort(ch1);
         Arrays.sort(ch2);
         if (Arrays.equals(ch1, ch2)) {
             System.out.println("They are anagrams");
         } else {
             System.out.println("Not anagrams");
         }

 }

}
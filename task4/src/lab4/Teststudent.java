package lab4;
import java.util.Scanner;
public class Teststudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Grade (A/B/C...): ");
        char grade = sc.next().charAt(0);
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        s1.setDetails(roll, grade, name);
        s1.showDetails();
        System.out.println("\n--- Direct Access Test ---");
        //System.out.println("Accessing public roll " + s.rollNumber);
        System.out.println("Accessing public name directly: " + s1.name); 
        sc.close();
    }
}
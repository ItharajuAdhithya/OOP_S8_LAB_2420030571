package lab4;
public class Student {
 private int rollnumber;
 protected char grade;
 public String name;
 public void setDetails(int rollNumber, char grade, String name) {
        this.rollnumber = rollNumber;
        this.grade = grade;
        this.name = name;
    }
    public void showDetails() {
        System.out.println("\nStudent Details :");
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
    }
}
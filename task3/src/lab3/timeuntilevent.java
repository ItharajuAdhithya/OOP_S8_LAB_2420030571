package lab3;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Duration;
public class timeuntilevent {
     public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the date and time in the format (yyyy-MM-dd HH:ss)");
       String s1=sc.nextLine();
       DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
       LocalDateTime dateTime1=LocalDateTime.parse(s1,formatter);
       LocalDateTime dateTime2=LocalDateTime.now();
       if(dateTime1.isBefore(dateTime2)){
         System.out.println("Event has already passed");
       }else{
       Duration duration=Duration.between(dateTime2,dateTime1);
       long days=duration.toDays();
       long hours=duration.toHours()%24;
       long minutes=duration.toMinutes()%60;
       System.out.println("Time remaining until event:");
       System.out.println(days+" days "+hours+" hours "+minutes+" minutes");
       }
       sc.close();
     }
    }

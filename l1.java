// similar problems and solutions of Lab 1

// Write a Java program that collects the user's name and age and displays
//  the name along with a message based on their age (e.g. "You are a child","You are a teenager", "You are an adult").
import java.util.*;
class info{
    public static void main (String []args){
        String name ;
        int age;
        char gender ;
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter your name : ");
        name = sc.nextLine();
        System.out.println("enter your age : ");
        age = sc.nextInt();
        System.out.println("enter your gender : ");
        gender = sc.next().charAt(0);
        if (age < 18){
            System.out.println(" child");
        }else if (age >= 1 && age <= 40){
            System.out.println("adult");
        }else {
            System.out.println("old");
        }


        
    }
}

// Write a Java program that collects the user's marks in three subjects and calculates their average. 
// If the average is greater than or equal to 60, display "You passed". Otherwise, display "You failed".

class avg {
    public static void main( String [] args){
        int mathmark;
        int engmark;
        int malmark;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your mathmark :");
        mathmark=sc.nextInt();
        System.out.println("enter your engmark: ");
        engmark=sc.nextInt();
        System.out.println("enter your malmark: ");
        malmark= sc.nextInt();
        int avrg ;
        avrg =(mathmark+ engmark+ malmark)/3;
        System.out.println("avrg mark is " + avrg);
        if ( avrg >=60){
            System.out.println("your passed your mark is " + avrg);
        }else{
            System.out.println("failed");
        }

    }
}

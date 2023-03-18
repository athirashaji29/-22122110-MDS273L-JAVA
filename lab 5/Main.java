import java.util.*;

class Student{
int RegNo;
String Name;
String Email;
String Phone;
String Class;
String Department;


Student(int RegNo,String Name,String Email,String Phone,String Class,String Department){
    this.RegNo = RegNo;
    this.Name = Name;
    this.Email = Email;
    this.Phone = Phone;
    this.Class = Class;
    this.Department = Department;
}

void display(){
    System.out.println("Reg No: " + RegNo);
    System.out.println("Name: " + Name);
    System.out.println("Email: " + Email);
    System.out.println("Phone: " + Phone);
    System.out.println("Class: " + Class);
    System.out.println("Department: " + Department);
}
}

public class Main{
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
Student[] students = new Student[100];
int choice = 0;
int count = 0;


    while(choice != 4){
        System.out.println("Menu:");
        System.out.println("1. Add a student");
        System.out.println("2. Search for a student");
        System.out.println("3. Display all students");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        
        choice = Integer.parseInt(scan.nextLine());
        
        switch(choice){
            case 1:
                System.out.println("Enter Reg No: ");
                int regNo = Integer.parseInt(scan.nextLine());
                System.out.println("Enter Name: ");
                String name = scan.nextLine();
                System.out.println("Enter Email: ");
                String email = scan.nextLine();
                System.out.println("Enter Phone: ");
                String phone = scan.nextLine();
                System.out.println("Enter Class: ");
                String classs = scan.nextLine();
                System.out.println("Enter Department: ");
                String department = scan.nextLine();
                
                Student student = new Student(regNo, name, email, phone, classs, department);
                students[count] = student;
                count++;
                System.out.println("Student added successfully!");
                break;
                
            case 2:
                System.out.println("Enter Reg No or Name of the student you want to search: ");
                String searchStr = scan.nextLine();
                boolean found = false;
                
                for(int i=0; i<count; i++){
                    if(searchStr.equalsIgnoreCase(students[i].Name) || searchStr.equals(Integer.toString(students[i].RegNo))){
                        System.out.println("Details of the student with Reg No " + students[i].RegNo + ":");
                        students[i].display();
                        found = true;
                        break;
                    }
                }
                
                if(!found){
                    System.out.println("Student not found!");
                }
                break;
                
            case 3:
                System.out.println("Details of all students:");
                
                for(int i=0; i<count; i++){
                    System.out.println("Details of the student with Reg No " + students[i].RegNo + ":");
                    students[i].display();
                }
                
                break;
                
            case 4:
                System.out.println("Exiting...");
                break;
                
            default:
                System.out.println("Invalid choice! Please enter a valid choice.");
                break;
        }
    }
}
}
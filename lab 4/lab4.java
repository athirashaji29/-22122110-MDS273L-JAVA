// Write a JAVA Menu driven program that does the following:
// You can ONLY have the below variables as global variables
// Account Number
// Account Holder Name
// Account Balance
// You MUST have the below as functions
// To initialize the customer
// To deposit money
// To withdraw money
// To print the transactions
// To print account summary
// Your menu will have the following operations once the customer is created
// To deposit money
// To withdraw money
// To print the transactions
// To print account summary
// You need to draw a flowchart and structure your results and program description, and other details in README.md.
import java.util.*;
 public class la4 {

    private static int accountNumber ;
    private  static String accountHolderName;
    private static float accountBalance;
    private static String transaction;

    public void initialize (int accNum,String acholname,float accoBal){
        accountNumber = accNum;
        accountHolderName= acholname;
        accountBalance=accoBal;
        transaction = "";

    }
    public static void deposit(float money){
        accountBalance += money;
        transaction +="deposited : "+ money+ "\n";



    }
    
    public static void withdraw (float money){
        if ( accountBalance<money){
            System.out.println("not balance");

        }
        else{
            accountBalance -= money;
            transaction += "withdraw : " + money + "\n";

        }
    }
    public static void transactions (){
        System.out.println("transactions: "+transaction+"\n") ;
    }
    public static void summary (String acholname,int accNum){
        System.out.println("account holder name "+ acholname+"\n");
        System.out.println("account no"+accNum+ "\n");
        System.out.println("transactions" + transaction+ "\n");
    }
    public static void main(String [] args){
        int choice;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter account holder name");
        String acholname = sc.nextLine();
        System.out.println("enter account no ");
        int accNum = sc.nextInt();
        // System.out.println("account balance ");
        float accoBal = 5000;
        float money;
        do{
       
        System.out.println("enter your choice \n1.deposite money \n2.withdrawmoney \n3.to print transaction \n4.to print account summary");
        choice = sc.nextInt();
        switch(choice){
            case 1: 
            System.out.print("enter the money you wish to deposite : ");
            money = sc.nextInt();
            deposit(money);
            System.out.println("deposited ");
            break;


            case 2:
            System.out.println("enter the ammount for withdraw");
            money = sc.nextInt();
            withdraw(money);
            System.out.println("withdrawed");
            break;

            case 3:
            transactions ();
            break;
            case 4:
            summary(acholname,accNum);
            break;

        }


        }while(choice !=0);
        sc.close();



    }
   
 }

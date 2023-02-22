import java.util.*;
public class lab4{
    static int accnt no;
    static String accnt name;
    static int accnt balance;
    static scanner scan= new scanner(System.in);
    static ArrayList<String> transactions = new ArrayList<>();
    public static void initializeCustomer(int accntNo, String accntHolderName, double accmntBalance) {
        accountNumber = accntNo;
        accountHolderName = accntHolderName;
        accountBalance = accntBalance;
    }


    
    // function to deposite money into account
    public void deposit( float amount){
        accntbalance += amount;
        transaction.add("updated balance is" + accntbalance);
    }

    // function to withdraw money frpm account
    public void withdraw(float amount){
        if(accntbalance< amount){
            System.out.println(" insufficient balance: ")
        }
        else{
            accntbalance -=amount;
            transaction.add("updated balance is "+ accntbalance);

        }
    }
    // function to print the transaction 
    public void transaction (){
       
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // function to print the account summary
    public void accntsummary(){
        System.out.println("Account Number" + accountNumber );
        System.out.println("Account Holder Name " + accountHolderName);
        System.out.println("ACcount balance " + accntbalance);
    }
    
    public static void main (static[] args){
    System.scan=new scanner(System.in);
    // Initialize the customer
        initializeCustomer(6466, "Athira Shaji", 2589);

        // Menu-driven program
        boolean quit = false;
    while(true){
        System.out.println(1.To deposit);
        System.out.println(2.To withdraw);
        System.out.println(3.To print the account transaction);
        System.out.println(4.To print Account summary);
        System.out.println(5.Exit);
        System.out.print("Enter your choice: ");
        int(option)= scanner.nextInt();
        switch(option){
            case 1:
                System.out.println(" enter the amount you wish to deposite:")
                float depositAmount = scanner.nextfloat();
                deposit(depositAmount);
                break;
            
            case 2:
                System.out.print("Enter withdrawal amount: ");
                float withdrawalAmount = scanner.nextfloat();
                withdraw(withdrawalAmount);
                break;
            case 3:
                printTransactions();
                break;
            case 4:
                printAccountSummary();
                break;
             case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");

            
        }

    }
     scanner.close();


    }





}
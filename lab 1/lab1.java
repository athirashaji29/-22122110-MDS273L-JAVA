
   import java.util.Scanner;
class lab1{
    public static void main(String[] args){
        String name ;
        int age;
        String Class;
        String state;
        char gender;
       
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name,age,Class,state,gender :");
        name = scan.nextLine();
        age = Integer.parseInt(scan.nextLine());
        Class = scan.nextLine();
        state = scan.nextLine();
        gender =scan.next().charAt(0);
       
        System.out.println("Name: "+name+"\nAge: "+age+"\nclass: "+Class+"\nstate: "+state+"\ngender: "+gender);
        if (gender=='f'){
            System.out.println("FEMALE");

        }else if(gender=='m'){
            System.out.println("MALE");
        }switch(state){
            case "kerala":
                System.out.println("The Student is from the southern states of India");
                break;
            case " Andhra Pradesh":
                System.out.println("The Student is from the southern states of India");
                break;
            case "karnadaka":
                System.out.println("The Student is from the southern states of India");
                break;
            case "tamilnadu":
                System.out.println("The Student is from the southern states of India");
                break;
            case "delhi":
                System.out.println("The Student is from the northern states of India");
                break;
            case "hariyana":
                System.out.println("The Student is from the northern states of India");
                break;
            case "jamukashmir":
                System.out.println("The Student is from the northern states of India");
                break;
            case "himachalpradesh":
                System.out.println("The Student is from the northern states of India");
                break;
            case "bihar":
                System.out.println("The Student is from the northern states of India");
                break;
            case "uttarpradesh":
                System.out.println("The Student is from the northern states of India");
                break;
            case "uttaragand":
                System.out.println("The Student is from the northern states of India");
                break;
            case "panjab":
                System.out.println("The Student is from the northern states of India");
                break;
            case "ladakh":
                System.out.println("The Student is from the northern states of India");
                break;
                
                



            }







    }

}
 

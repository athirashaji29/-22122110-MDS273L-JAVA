// // Create a program that manages a library's book collection. The program should allow the user to add, search for
// , remove, or display books in the library's collection. Each book record should include the book's title, author, publisher, 
// and ISBN. The program should validate user input to ensure that the entered data is valid.
    
import java.util.*;
public class la2{
    public static void main (String [] args){
        String [] books = new String [1080] ;
        int count1 =0;
        String [] authors= new String [290];
        int count2 =0;
        String [] publishers =new String [290];
        int count3 =0;


         
        Scanner sc = new Scanner ( System.in);
        int option;
        do {
            System.out.println("1. enter book name ;");
            System.out.println("2.search for a book ;");
            System.out.println("3.remove a book ;");
            System.out.println("4.display all the books");
            System.out.println("5.exist");
            option = sc.nextInt();
            String book;
            String author;
            String publisher ;

            switch( option){
                case 1: 
                System.out.println(" enter book name ");
                book = sc.next();
                System.out.println("ente auth");
                author = sc.next();
                System.out.println(" enter pub");
                publisher=sc.next();
                for ( int i =0; i <count1 ; i++){
                    if( books[i].equalsIgnoreCase(book)){
                System.out.print("name already exist ");
                    }
                
                }
            books[count1]= book;
            count1 ++;
            authors[count2]=author;
            count2++;
            publishers[count3]= publisher;
            count3++;
            System.out.println("book details added");
            break;
            case 2:
            System.out.println("search for a book ");
            book = sc.next();
            for( int i=0; i<count1;i++){
                if(books[i].equalsIgnoreCase(book)){
                    System.out.println("book name exist in idex no" + i);

                }else{
                    System.out.println("name not exist");
                }
            }
            
            break;
           case 3:
           System.out.println("remove a book name");
           book = sc.next();
           int index = -1;
           for(int i=0; i< count1; i++){
            if (books[i].equals(book)){
                index = i;
                break;


            }
           }
           if ( index == -1){
            System.out.println(" name not exist");
            break;
           }
           for ( int i=0; i<count1-1; i++){
            books [i] = books[i+1];
            
           }
           count1--;
           System.out.println(" name removed ");
           break;
           case 4:
           System.out.println(" diplaying all n=books");
           for ( int i =0; i<count1;i++){
            System.out.println((i+1)+"."+ books[i]);
           }
           break;
           case 5:
           System.out.println("exist");


            }
        } while( option !=0);      

        
   }
}

// Write a program that allows the user to enter the details of up to 1000 employees, 
// including their name, age, and salary. The program should have a menu-driven interface that allows the user to add, search for, remove,
// or display employee records. The program should validate all user input to ensure that the entered data is valid.

import java.util.*;
public class la2{
    public static void main (String [] args){
        String [] arr = new String [1000];
        int count =0;
        int option;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.enter a employ name");
            System.out.println("2.search for a employ name ");
            System.out.println("3.remove a employ name ");
            System.out.println("4.display all the details");
            System.out.println("5.exist ");
            option = sc.nextInt();
            String name ;
            
            switch(option){
                case 1:
                System.out.println("enter emply name ");
                name = sc.next();
                for ( int i =0 ; i<count ; i++){
                    if(arr[i].equalsIgnoreCase(name)){
                        System.out.print("name already exist ");
                    // }else {
                    //     arr[i]=name;
                    //     count ++;
                    //     System.out.print("name added");
                    // }
                }
            }
                arr[count]=name;
                count ++;
                System.out.println("name added");
                break;
                case 2:
                System.out.println("enter name ");
                name = sc.next();
                for( int i =0; i<count ; i++){
                    if (arr[i].equals(name)){
                        System.out.println("name exist in index"+ i);
                    
                    }
                        
                    
                }
                System.out.println("name not exist ");
                
                break;
                case 3:
                System.out.println("enter the name ");
                name= sc.next();
                int index = -1 ;
                for(int i =0; i<count ; i++){
                    if(arr[i].equals(name)){
                        index = i;
                        break;
                    }
                }
                if (index ==-1 ){
                    System.out.println("name not exisist");
                }
                for( int i =0; i<count-1; i++){
                    arr[i]= arr[i+1];
                }
                count--;
        
                System.out.println("name removed");
                break;
                case 4:
                System.out.println("diplaying all names ");
                for ( int i =0; i<count; i++){
                    System.out.println((i+1)+"."+arr[i]);
                    break;
                }

            }
        }while( option !=0);


    }
}

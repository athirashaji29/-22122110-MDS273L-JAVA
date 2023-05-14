// Write a Java program that takes an array of integers as input and returns the maximum value in the array.
// import java.util.*;
// public class la3{


static int fnmax(int [] array){
    int max =0;
    Arrays.sort(array);
    max = array[array.length -1];
    return max;

}


public static void main ( String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size ");
    int size = sc.nextInt();
    int [] array = new int [size ];
    System.out.println("enter the values ");
    for( int i =0 ;i<array.length; i++ ){
    array [i] = sc.nextInt();
    
    }int max = fnmax(array);
    System.out.println("max is" + max );
}



// Write a Java program that accepts a string as input and returns the number of vowels in the string.




import java.util.*;

public class la3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = sc.nextLine();
        String[] arr = text.split("");
        String[] vowels = {"a", "e", "i", "o", "u"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arr[i].equalsIgnoreCase(vowels[j])) {
                    count++;
                }
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}

// Create a Java program that takes a string as input and returns the reverse of the string.

import java.util.*;
public class la3{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string ");
        String txt = sc.nextLine();
        String rever= fnrev(txt);
        System.out.println(" string rev is: " + rever);

        }
        static String fnrev(String txt){
            String rev ="";
            for ( int i = txt.length()-1; i>=0;i--){
                rev += txt.charAt(i);
            }
            return rev;
        }
    }

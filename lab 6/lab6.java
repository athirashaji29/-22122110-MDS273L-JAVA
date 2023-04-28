import java.util.*;
import java.io.*;


public class lab6 {
    

    static int[] Vowelcount(String temp) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int[] counts = new int[vowels.length];
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]) {
                    counts[j]++;
                    break;
                }
            }
        }
        System.out.println("Vowel count: ");
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i] + ": " + counts[i]);
        }
        return counts;
    }
    static int [] digitscount(String temp){
        char[] digit = { '0','1','2','3','4','5','6','7','8','9'};
        int[] counts = new int[digit.length];
        
        for(int i = 0 ;i<temp.length(); i++){
            char a = temp.charAt(i);
            for( int j =0 ; j<digit.length; j++){
                if( a == digit[j]){
                    counts[j]++;
                    break;
                }
            }
        }
        System.out.println("digital count : ");
        for( int i =0;i < digit.length; i++){
            System.out.println(digit[i] + ": "+ counts [i]);
        } 
        return counts;
    }
    public static void main(String[] args) {
        String temp="";
         
        try {
            File file = new File("C:/Users/athira shaji/Downloads/text (1).txt");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
              
                temp += read.nextLine();
                // String arr[] = temp.split(" ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Vowelcount(temp);
        digitscount(temp);
    }
}
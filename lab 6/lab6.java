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
    public static String[] getTopWords(String temp, int n) {
        String[] words = temp.split("[\\W]+");
        String[] topWords = new String[n];
        int[] counts = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            counts[i] = 1;
            for (int j = i + 1; j < words.length; j++) {
if (words[i].equalsIgnoreCase(words[j])) {
counts[i]++;
}
}
}
for (int i = 0; i < n; i++) {
int maxIndex = getMaxIndex(counts);
topWords[i] = words[maxIndex];
counts[maxIndex] = -1;
}
return topWords;
}
public static String[] getLeastWords(String temp, int n) {
    String[] words = temp.split("[\\W]+");
    String[] leastWords = new String[n];
    int[] counts = new int[words.length];
    for (int i = 0; i < words.length; i++) {
        counts[i] = 1;
        for (int j = i + 1; j < words.length; j++) {
            if (words[i].equalsIgnoreCase(words[j])) {
                counts[i]++;
            }
        }
    }
    for (int i = 0; i < n; i++) {
        int minIndex = getMinIndex(counts);
        leastWords[i] = words[minIndex];
        counts[minIndex] = Integer.MAX_VALUE;
    }
    return leastWords;
}

public static char[] getTopChars(String temp, int n) {
    char[] chars = temp.replaceAll("\\s+", "").toCharArray();
    char[] topChars = new char[n];
    int[] counts = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
        counts[i] = 1;
        for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j]) {
                counts[i]++;
            }
        }
    }
    for (int i = 0; i < n; i++) {
        int maxIndex = getMaxIndex(counts);
        topChars[i] = chars[maxIndex];
        counts[maxIndex] = -1;
    }
    return topChars;
}

public static char[] getLeastChars(String temp, int n) {
    char[] chars = temp.replaceAll("\\s+", "").toCharArray();
    char[] leastChars = new char[n];
    int[] counts = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
        counts[i] = 1;
        for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j]) {
                counts[i]++;
            }
        }
    }
    for (int i = 0; i < n; i++) {
        int minIndex = getMinIndex(counts);
        leastChars[i] = chars[minIndex];
        counts[minIndex] = Integer.MAX_VALUE;
    }
    return leastChars;
}

public static int countChar(String temp, char ch) {
    int count = 0;
    for (int i = 0; i < temp.length(); i++) {
        if (temp.charAt(i) == ch) {
            count++;
        }
    }
    return count;
}

public static int getMaxIndex(int[] array) {
    int maxIndex = 0;
    for (int i = 1; i < array.length; i++) {
        if (array[i] > array[maxIndex]) {
            maxIndex = i;
        }
    }
    return maxIndex;
}

public static int getMinIndex(int[] array) {
    int minIndex = 0;
    for (int i = 1; i < array.length; i++) {
        if(array[i] < array[minIndex]) {
minIndex = i;
}
}
return minIndex;
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
           String[] topWords = getTopWords(temp, 5);
        String[] leastWords = getLeastWords(temp, 5);
        char[] topChars = getTopChars(temp, 5);
        char[] leastChars = getLeastChars(temp, 5);
        System.out.println("Top 5 repeated words and their count:");
        for (String word : topWords) {
            System.out.println(word);
        }

        System.out.println("Least 5 repeated words and their count:");
        for (String word : leastWords) {
            System.out.println(word);
        }

        System.out.println("Top 5 repeated characters and their count:");
        for (char ch : topChars) {
            System.out.println(ch + ": " + countChar(temp, ch));
        }

        System.out.println("Least 5 repeated characters and their count:");
        for (char ch : leastChars) {
            System.out.println(ch + ": " + countChar(temp, ch));
        }
    }
}
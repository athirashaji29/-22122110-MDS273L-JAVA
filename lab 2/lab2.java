


import java.util.*;

public class lab2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] names = new String[1024];
    
int option;
int num = 0;
do{
  System.out.println("menu:");
  System.out.println("1. enter a name");
  System.out.println("2. search for a name");
  System.out.println("3. remove a name");
  System.out.println("4. show all names");
  System.out.println("5. exit");
  System.out.print("enter any option: ");
  option = input.nextInt();
  switch(option){
  case 1:
  System.out.print("enter a name: ");
  String newName = input.next();
  boolean isDuplicate = false;
  for (int i = 0; i < num; i++) {
    if (names[i].equals(newName)) {
      System.out.println("Name already exists");
      isDuplicate = true;
      break;
    }
  }
  if (!isDuplicate) {
    names[num] = newName;
    num++;
  }
  break;
    case 2:
    System.out.print("enter a name for searching: ");
    String searchName = input.next();
    boolean found = false;
    for(int i =0; i<num;i++){
        if (names[i].equals(searchName)) {
          System.out.println("name found at position " + (i + 1));
          found = true;
          break;
        }
      }
      if (!found) {
        System.out.println("name not found");
      }
      break;
      case 3:
      System.out.print("enter a name to remove: ");
      String removeName = input.next();
      for(int i =0;i<num;i++){
        if (names[i].equals(removeName)){
            for (int j=i ;j<num-1;j++){
                names[j] =names[j+1];

            }
            num--;
            System.out.println("name removed");
            break;
        }
      }
      break;
      case 4:
      System.out.println("all names: ");
      for (int i =0;i<num;i++){
        System.out.println((i+1)+" "+names[i]);

      }
      break;
       case 5:
      System.out.println("exit...");
      break;
    default:
      System.out.println("Invalid choice");

    }
  }while (option != 5);
}
}
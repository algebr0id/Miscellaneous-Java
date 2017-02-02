import java.util.*;

public class Reverse{
   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      stringReverse(userInput);
   }
   
   public static void stringReverse(Scanner userInput){
      System.out.print("Enter a phrase: ");
      String phrase = userInput.nextLine();
      char[] letters = new char[phrase.length()];
      for(int i = 0; i < phrase.length(); i++){
         letters[i] = phrase.charAt(i);
      }
      char[] chars = new char[letters.length];
      for(int i = 0; i < letters.length; i++){
         chars[i] = letters[(letters.length - 1) - i];
      }
      System.out.println("");
      System.out.println("Reversed phrase: ");
      for(char i : chars){
         System.out.print(i);
      }
   }
}
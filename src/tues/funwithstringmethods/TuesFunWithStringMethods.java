package tues.funwithstringmethods;

import java.util.Scanner;
/**
 *
 * @author john
 */
public class TuesFunWithStringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String userInput;
        int numOfVowels = 0;
        
        System.out.println("Please enter in some string: ");
        userInput = stdin.nextLine();
        
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            
            switch(currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numOfVowels++;
                    break;
            }
        }
        
        System.out.println("There were " + numOfVowels + " number of vowels.");
    }
    
}

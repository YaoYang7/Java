import java.util.Scanner;
import java.util.HashMap;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        
        String str3 = (str1 + " " + str2);
        System.out.println(str3);

        int charCount = charCount(str3);
        System.out.println("Character count: " + charCount);

        // for reversing the string
        String[] reverseString = str3.split(" ");
        for (int i = reverseString.length - 1; i >= 0; i--) {
            System.out.print(reverseString[i] + " ");
        }

        // for counting the letters
        HashMap<String, Integer> letterList = new HashMap<String, Integer>();   // create a hashmap to store the letters
        String[] letterArray = str3.split("");  // split the string into an array of letters
        for (String letter : letterArray) {   // loop through the array of letters
            if (letter.equals(" ")) {
                continue;
              }  // skip spaces 
            
            if (letterList.containsKey(letter)) { // if the letter is already in the hashmap, increment the value by 1
                letterList.put(letter, letterList.get(letter) + 1); 
            } else {   // if the letter is not in the hashmap, add it to the hashmap with a value of 1
                letterList.put(letter, 1);
            }
        }


        // Loops through the hashmap and prints out the letters that appear more than once
        System.out.println("\nLetters that appear more than once: ");
        for (String key : letterList.keySet()) {
            int checkVal = letterList.get(key);
            if (checkVal >= 2) {
                System.out.print(key + " ");
            }
        }

    }

    public static int charCount(String inputStr) {
        // remove spaces
        String strNoSpace = inputStr.replaceAll("\\s", "");     // replace all spaces with empty string
        return strNoSpace.length();
    }

}

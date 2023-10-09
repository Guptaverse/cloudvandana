//Q3. checking input string is pangram or not 

package JAVA;

import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

    public boolean isPangram(String sentence) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            map.put(sentence.charAt(i), 1);
        }

        if (map.size() == 26) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        Pangram p = new Pangram();
        boolean isPangram = p.isPangram(inputString);
        if(isPangram){
            System.out.println("it is Pangram ");
        }else{
            System.out.println("not a pangram");
        }
    }

}

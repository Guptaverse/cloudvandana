// Q2 : Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
package JAVA;
import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        RomanToInteger romanConverter = new RomanToInteger(); 
        String romanNumeral = "XI";
        int integerEquivalent = romanConverter.romanToInt(romanNumeral);
        if (integerEquivalent != -1) {
            System.out.println("The integer equivalent of " + romanNumeral + " is " + integerEquivalent);
        }
    }
}


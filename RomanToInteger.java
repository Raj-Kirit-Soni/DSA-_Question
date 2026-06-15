import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // Map Roman symbols to their values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));

            // Look ahead to the next character (if any)
            if (i + 1 < s.length()) {
                int next = romanMap.get(s.charAt(i + 1));
                if (current < next) {
                    // Subtractive case
                    total -= current;
                } else {
                    total += current;
                }
            } else {
                total += current;
            }
        }

        return total;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));      // Output: 3
        System.out.println(romanToInt("LVIII"));    // Output: 58
        System.out.println(romanToInt("MCMXCIV"));  // Output: 1994
    }
}

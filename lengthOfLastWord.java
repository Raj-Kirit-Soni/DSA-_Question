public class lengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Input: \"" + s1 + "\" → Output: " + solution.lengthOfLastWord(s1));
        System.out.println("Input: \"" + s2 + "\" → Output: " + solution.lengthOfLastWord(s2));
        System.out.println("Input: \"" + s3 + "\" → Output: " + solution.lengthOfLastWord(s3));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        // Trim spaces at the ends
        s = s.trim();
        
        // Find the last space
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Length of last word = total length - position of last space - 1
        return s.length() - lastSpaceIndex - 1;
    }
}

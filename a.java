public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + isPalindrome(s1)); // true

        System.out.println("Input: " + s2);
        System.out.println("Output: " + isPalindrome(s2)); // false

        System.out.println("Input: " + s3);
        System.out.println("Output: " + isPalindrome(s3)); // true
    }
}

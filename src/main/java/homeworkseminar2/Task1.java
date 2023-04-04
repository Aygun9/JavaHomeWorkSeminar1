package homeworkseminar2;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        boolean isStr1Palindrome = isPalindrome(str1);
        boolean isStr2Palindrome = isPalindrome(str2);

        System.out.println(str1 + " is palindrome: " + isStr1Palindrome);
        System.out.println(str2 + " is palindrome: " + isStr2Palindrome);
    }

    public static boolean isPalindrome(String str) {
        // Remove all spaces and convert string to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Check if the reversed string is equal to the original string
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
